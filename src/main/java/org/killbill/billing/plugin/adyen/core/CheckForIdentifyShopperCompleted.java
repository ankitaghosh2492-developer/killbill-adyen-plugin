/*
 * Copyright 2014-2019 Groupon, Inc
 * Copyright 2014-2019 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.adyen.core;

import java.util.List;
import java.util.UUID;
import com.google.common.collect.ImmutableMap;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.plugin.adyen.api.AdyenCallContext;
import org.killbill.billing.plugin.adyen.api.AdyenPaymentPluginApi;
import org.killbill.billing.plugin.adyen.dao.AdyenDao;
import org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenResponsesRecord;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.killbill.billing.plugin.api.PluginProperties;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.clock.Clock;
import org.killbill.clock.DefaultClock;

import static org.killbill.billing.plugin.adyen.api.AdyenPaymentPluginApi.PROPERTY_THREEDS_COMP_IND;

public class CheckForIdentifyShopperCompleted extends CheckForThreeDs2StepCompleted {


    @JsonCreator
    public CheckForIdentifyShopperCompleted(@JsonProperty final UUID uuidKey,
                                            @JsonProperty final UUID kbTenantId,
                                            @JsonProperty final UUID kbPaymentId,
                                            @JsonProperty final String kbPaymentTransactionId,
                                            @JsonProperty final String kbPaymentTransactionExternalKey,
                                            @JsonProperty final UUID kbPaymentMethodId) {
        super(uuidKey, kbTenantId, kbPaymentId, kbPaymentTransactionId, kbPaymentTransactionExternalKey, kbPaymentMethodId);
    }

    @Override
    public void performAction(final AdyenPaymentPluginApi adyenPaymentPluginApi, final AdyenDao adyenDao) throws Exception {
        final Clock clock = new DefaultClock();
        final CallContext context = new AdyenCallContext(clock.getUTCNow(), getKbTenantId());
        final AdyenResponsesRecord adyenResponsesRecord = adyenDao.getSuccessfulAuthorizationResponse(getKbPaymentId(), getKbTenantId());

        if (adyenResponsesRecord == null) {
            throw new PaymentPluginApiException(null, "Unable to retrieve previous payment response for kbPaymentTransactionId " + getKbPaymentTransactionId());
        }

        if (adyenResponsesRecord.getKbPaymentTransactionId() != getKbPaymentTransactionId()) {
            return;
        }
        if (adyenResponsesRecord.getResultCode() != "IdentifyShopper") {
            return;
        }

        if(adyenResponsesRecord != null) {

            final List<PluginProperty> propertiesWithCompInd = PluginProperties.buildPluginProperties(ImmutableMap.of(PROPERTY_THREEDS_COMP_IND, "Y"));

            UUID kbAccountId = UUID.fromString(adyenResponsesRecord.getKbAccountId());
            adyenPaymentPluginApi.authorizePayment(kbAccountId,
                    getKbPaymentId(),
                    UUID.fromString(getKbPaymentTransactionId()),
                    getKbPaymentMethodId(),
                    adyenResponsesRecord.getAmount(),
                    Currency.fromCode(adyenResponsesRecord.getCurrency()),
                    propertiesWithCompInd,
                    context);

        }

    }
}
