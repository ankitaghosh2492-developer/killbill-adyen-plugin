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

import java.util.UUID;

import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.plugin.adyen.api.AdyenPaymentPluginApi;
import org.killbill.billing.plugin.adyen.client.model.PurchaseResult;
import org.killbill.billing.plugin.adyen.dao.AdyenDao;
import org.killbill.billing.plugin.adyen.dao.gen.tables.records.AdyenResponsesRecord;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckForIdentifyShopperCompleted extends CheckForThreeDs2StepCompleted {

    @JsonCreator
    public CheckForIdentifyShopperCompleted(@JsonProperty final UUID uuidKey,
                                            @JsonProperty final UUID kbTenantId,
                                            @JsonProperty final UUID kbPaymentId,
                                            @JsonProperty final String kbPaymentTransactionId,
                                            @JsonProperty final String kbPaymentTransactionExternalKey) {
        super(uuidKey, kbTenantId, kbPaymentId, kbPaymentTransactionId, kbPaymentTransactionExternalKey);
    }

    @Override
    public void performAction(final AdyenPaymentPluginApi adyenPaymentPluginApi, final AdyenDao adyenDao) throws Exception {
        final AdyenResponsesRecord previousResponse = adyenDao.getSuccessfulAuthorizationResponse(getKbPaymentId(), getKbTenantId());
        if (previousResponse == null) {
            throw new PaymentPluginApiException(null, "Unable to retrieve previous payment response for kbPaymentTransactionId " + getKbPaymentTransactionId());
        }

        if (previousResponse.getKbPaymentTransactionId() != getKbPaymentTransactionId()) {
            // the payment has already advanced, so nothing to do
            return;
        }
        if (previousResponse.getResultCode() != "IdentifyShopper") {
            // we are not actually in identify, so nothing to do
            return;
        }
        // TODO: send threeDSCompInd = N to adyen and mark the payment as failed
//        final PurchaseResult failureResult = new PurchaseResult(getKbPaymentTransactionExternalKey(), adyenCall);
//        adyenDao.addResponse();
    }
}
