/*
 * Copyright 2014-2016 Groupon, Inc
 * Copyright 2014-2016 The Billing Project, LLC
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

package org.killbill.billing.plugin.adyen.client.model;

import java.util.Locale;

import org.joda.time.DateTime;

public class UserData {

    private String shopperEmail;
    private String shopperReference;
    private Locale shopperLocale;
    private String firstName;
    private String infix;
    private String lastName;
    private String gender;
    private String telephoneNumber;
    private String socialSecurityNumber;
    private DateTime dateOfBirth;
    private String shopperIP;

    // Shopper Account Info
    private String accountAgeIndicator;
    private DateTime accountChangeDate;
    private String accountChangeIndicator;
    private DateTime accountCreationDate;
    private DateTime passwordChangeDate;
    private String passwordChangeDateIndicator;
    private Integer purchasesLast6Months;
    private Integer addCardAttemptsDay;
    private Integer pastTransactionsDay;
    private Integer pastTransactionsYear;
    private DateTime paymentAccountAge;
    private String paymentAccountIndicator;
    private DateTime deliveryAddressUsageDate;
    private String deliveryAddressUsageIndicator;
    private Boolean suspiciousActivity;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String passwordChangeIndicator;

    public String getShopperEmail() {
        return shopperEmail;
    }

    public void setShopperEmail(final String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }

    public String getShopperReference() {
        return shopperReference;
    }

    public void setShopperReference(final String shopperReference) {
        this.shopperReference = shopperReference;
    }

    public Locale getShopperLocale() {
        return shopperLocale;
    }

    public void setShopperLocale(final Locale shopperLocale) {
        this.shopperLocale = shopperLocale;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getInfix() {
        return infix;
    }

    public void setInfix(final String infix) {
        this.infix = infix;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(final String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(final String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getShopperIP() {
        return shopperIP;
    }

    public void setShopperIP(final String shopperIP) {
        this.shopperIP = shopperIP;
    }

    public String getAccountAgeIndicator() {
        return accountAgeIndicator;
    }

    public void setAccountAgeIndicator(String accountAgeIndicator) {
        this.accountAgeIndicator = accountAgeIndicator;
    }

    public DateTime getAccountChangeDate() {
        return accountChangeDate;
    }

    public void setAccountChangeDate(DateTime accountChangeDate) {
        this.accountChangeDate = accountChangeDate;
    }

    public String getAccountChangeIndicator() {
        return accountChangeIndicator;
    }

    public void setAccountChangeIndicator(String accountChangeIndicator) {
        this.accountChangeIndicator = accountChangeIndicator;
    }

    public DateTime getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(DateTime accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public DateTime getPasswordChangeDate() {
        return passwordChangeDate;
    }

    public void setPasswordChangeDate(DateTime passwordChangeDate) {
        this.passwordChangeDate = passwordChangeDate;
    }

    public String getPasswordChangeDateIndicator() {
        return passwordChangeDateIndicator;
    }

    public void setPasswordChangeDateIndicator(String passwordChangeDateIndicator) {
        this.passwordChangeDateIndicator = passwordChangeDateIndicator;
    }

    public Integer getPurchasesLast6Months() {
        return purchasesLast6Months;
    }

    public void setPurchasesLast6Months(Integer purchasesLast6Months) {
        this.purchasesLast6Months = purchasesLast6Months;
    }

    public Integer getAddCardAttemptsDay() {
        return addCardAttemptsDay;
    }

    public void setAddCardAttemptsDay(Integer addCardAttemptsDay) {
        this.addCardAttemptsDay = addCardAttemptsDay;
    }

    public Integer getPastTransactionsDay() {
        return pastTransactionsDay;
    }

    public void setPastTransactionsDay(Integer pastTransactionsDay) {
        this.pastTransactionsDay = pastTransactionsDay;
    }

    public Integer getPastTransactionsYear() {
        return pastTransactionsYear;
    }

    public void setPastTransactionsYear(Integer pastTransactionsYear) {
        this.pastTransactionsYear = pastTransactionsYear;
    }

    public DateTime getPaymentAccountAge() {
        return paymentAccountAge;
    }

    public void setPaymentAccountAge(DateTime paymentAccountAge) {
        this.paymentAccountAge = paymentAccountAge;
    }

    public String getPaymentAccountIndicator() {
        return paymentAccountIndicator;
    }

    public void setPaymentAccountIndicator(String paymentAccountIndicator) {
        this.paymentAccountIndicator = paymentAccountIndicator;
    }

    public DateTime getDeliveryAddressUsageDate() {
        return deliveryAddressUsageDate;
    }

    public void setDeliveryAddressUsageDate(DateTime deliveryAddressUsageDate) {
        this.deliveryAddressUsageDate = deliveryAddressUsageDate;
    }

    public String getDeliveryAddressUsageIndicator() {
        return deliveryAddressUsageIndicator;
    }

    public void setDeliveryAddressUsageIndicator(String deliveryAddressUsageIndicator) {
        this.deliveryAddressUsageIndicator = deliveryAddressUsageIndicator;
    }

    public Boolean getSuspiciousActivity() {
        return suspiciousActivity;
    }

    public void setSuspiciousActivity(Boolean suspiciousActivity) {
        this.suspiciousActivity = suspiciousActivity;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getPasswordChangeIndicator() {
        return passwordChangeIndicator;
    }

    public void setPasswordChangeIndicator(String passwordChangeIndicator) {
        this.passwordChangeIndicator = passwordChangeIndicator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserData{");
        sb.append("shopperEmail='").append(shopperEmail).append('\'');
        sb.append(", shopperReference='").append(shopperReference).append('\'');
        sb.append(", shopperLocale=").append(shopperLocale);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", infix='").append(infix).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", telephoneNumber='").append(telephoneNumber).append('\'');
        sb.append(", socialSecurityNumber='").append(socialSecurityNumber).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", shopperIP='").append(shopperIP).append('\'');
        sb.append(", accountAgeIndicator='").append(accountAgeIndicator).append('\'');
        sb.append(", accountChangeDate='").append(accountChangeDate).append('\'');
        sb.append(", accountChangeIndicator='").append(accountChangeIndicator).append('\'');
        sb.append(", accountCreationDate='").append(accountCreationDate).append('\'');
        sb.append(", passwordChangeDate='").append(passwordChangeDate).append('\'');
        sb.append(", passwordChangeDateIndicator='").append(passwordChangeDateIndicator).append('\'');
        sb.append(", purchasesLast6Months='").append(purchasesLast6Months).append('\'');
        sb.append(", addCardAttemptsDay='").append(addCardAttemptsDay).append('\'');
        sb.append(", pastTransactionsDay='").append(pastTransactionsDay).append('\'');
        sb.append(", pastTransactionsYear='").append(pastTransactionsYear).append('\'');
        sb.append(", paymentAccountAge='").append(paymentAccountAge).append('\'');
        sb.append(", paymentAccountIndicator='").append(paymentAccountIndicator).append('\'');
        sb.append(", deliveryAddressUsageDate='").append(deliveryAddressUsageDate).append('\'');
        sb.append(", deliveryAddressUsageIndicator='").append(deliveryAddressUsageIndicator).append('\'');
        sb.append(", suspiciousActivity='").append(suspiciousActivity).append('\'');
        sb.append(", homePhone='").append(homePhone).append('\'');
        sb.append(", mobilePhone='").append(mobilePhone).append('\'');
        sb.append(", workPhone='").append(workPhone).append('\'');

        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final UserData userData = (UserData) o;

        if (shopperEmail != null ? !shopperEmail.equals(userData.shopperEmail) : userData.shopperEmail != null) {
            return false;
        }
        if (shopperReference != null ? !shopperReference.equals(userData.shopperReference) : userData.shopperReference != null) {
            return false;
        }
        if (shopperLocale != null ? !shopperLocale.equals(userData.shopperLocale) : userData.shopperLocale != null) {
            return false;
        }
        if (firstName != null ? !firstName.equals(userData.firstName) : userData.firstName != null) {
            return false;
        }
        if (infix != null ? !infix.equals(userData.infix) : userData.infix != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(userData.lastName) : userData.lastName != null) {
            return false;
        }
        if (gender != null ? !gender.equals(userData.gender) : userData.gender != null) {
            return false;
        }
        if (telephoneNumber != null ? !telephoneNumber.equals(userData.telephoneNumber) : userData.telephoneNumber != null) {
            return false;
        }
        if (socialSecurityNumber != null ? !socialSecurityNumber.equals(userData.socialSecurityNumber) : userData.socialSecurityNumber != null) {
            return false;
        }
        if (dateOfBirth != null ? !dateOfBirth.equals(userData.dateOfBirth) : userData.dateOfBirth != null) {
            return false;
        }
        return shopperIP != null ? shopperIP.equals(userData.shopperIP) : userData.shopperIP == null;

    }

    @Override
    public int hashCode() {
        int result = shopperEmail != null ? shopperEmail.hashCode() : 0;
        result = 31 * result + (shopperReference != null ? shopperReference.hashCode() : 0);
        result = 31 * result + (shopperLocale != null ? shopperLocale.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (infix != null ? infix.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (socialSecurityNumber != null ? socialSecurityNumber.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (shopperIP != null ? shopperIP.hashCode() : 0);
        return result;
    }
}
