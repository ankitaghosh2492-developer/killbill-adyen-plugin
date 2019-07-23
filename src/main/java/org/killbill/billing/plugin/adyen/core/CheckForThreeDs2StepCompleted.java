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

public abstract class CheckForThreeDs2StepCompleted extends DelayedActionEvent {
    private final UUID kbTenantId;
    private final UUID kbPaymentId;
    private final String kbPaymentTransactionId;
    private final String kbPaymentTransactionExternalKey;
    private final UUID kbPaymentMethodId;

    public CheckForThreeDs2StepCompleted(final UUID uuidKey,
                                         final UUID kbTenantId,
                                         final UUID kbPaymentId,
                                         final String kbPaymentTransactionId,
                                         final String kbPaymentTransactionExternalKey,
                                         final UUID kbPaymentMethodId) {
        super(uuidKey);
        this.kbTenantId = kbTenantId;
        this.kbPaymentId = kbPaymentId;
        this.kbPaymentTransactionId = kbPaymentTransactionId;
        this.kbPaymentTransactionExternalKey = kbPaymentTransactionExternalKey;
        this.kbPaymentMethodId = kbPaymentMethodId;
    }

    public UUID getKbTenantId() {
        return kbTenantId;
    }

    public UUID getKbPaymentId() {
        return kbPaymentId;
    }

    public String getKbPaymentTransactionId() {
        return kbPaymentTransactionId;
    }

    public String getKbPaymentTransactionExternalKey() {
        return kbPaymentTransactionExternalKey;
    }

    public UUID getKbPaymentMethodId(){
        return kbPaymentMethodId;
    }
}
