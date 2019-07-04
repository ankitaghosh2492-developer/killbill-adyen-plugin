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

import org.killbill.adyen.threeds2data.ThreeDS2TimeFrame;
import org.killbill.adyen.threeds2data.ThreeDS2TimeFrameWithNotApplicable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Map;

public class PaymentInfo {

    private Integer captureDelayHours;
    private Integer installments;
    private String contract;
    private String shopperInteraction;
    private String shopperStatement;
    // browser info
    private String acceptHeader;
    private Integer colorDepth;
    private Boolean javaEnabled;
    private Boolean javaScriptEnabled;
    private String browserLanguage;
    private Integer screenHeight;
    private Integer screenWidth;
    private Integer browserTimeZoneOffset;
    private String userAgent;
    // 3D Secure v1
    private Long threeDThreshold;
    private String md;
    private String paRes;
    private String mpiDataDirectoryResponse;
    private String mpiDataAuthenticationResponse;
    private String mpiDataCavv;
    private String mpiDataCavvAlgorithm;
    private String mpiDataXid;
    private String mpiDataEci;
    private String mpiImplementationType;
    private Map<String, String> mpiImplementationTypeValues;
    private String termUrl;
    // 3D Secure v2
    private String notificationUrl;
    private String threeDSCompInd;
    private String threeDSServerTransID;
    private String threeDS2Token;
    private String threeDSMethodURL;
    private String acsTransID;
    private String messageVersion;
    private String transStatus;
    private String acsChallengeMandated;
    private String authenticationType;
    private String dsTransID;
    private String acsReferenceNumber;

    // Billing Address
    private String street;
    private String houseNumberOrName;
    private String city;
    private String postalCode;
    private String stateOrProvince;
    private String country;
    // Special fields
    private String acquirer;
    private String acquirerMID;
    private String selectedBrand;

    // Account Info
    private ThreeDS2TimeFrameWithNotApplicable accountAgeIndicator;
    private XMLGregorianCalendar accountChangeDate;
    private ThreeDS2TimeFrame accountChangeIndicator;
    private XMLGregorianCalendar accountCreationDate;
    private Integer addCardAttemptsDay;
    private XMLGregorianCalendar deliveryAddressUsageDate;
    private ThreeDS2TimeFrame deliveryAddressUsageIndicator;
    private String homePhone;
    private String mobilePhone;
    private XMLGregorianCalendar passwordChangeDate;
    private ThreeDS2TimeFrameWithNotApplicable passwordChangeIndicator;
    private Integer pastTransactionsDay;
    private Integer pastTransactionsYear;
    private XMLGregorianCalendar paymentAccountAge;
    private ThreeDS2TimeFrameWithNotApplicable paymentAccountIndicator;
    private Integer purchasesLast6Months;
    private Boolean suspiciousActivity;
    private String workPhone;
    private String passwordChangeDateIndicator;



    public Integer getCaptureDelayHours() {
        return captureDelayHours;
    }

    public void setCaptureDelayHours(final Integer captureDelayHours) {
        this.captureDelayHours = captureDelayHours;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(final Integer installments) {
        this.installments = installments;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(final String contract) {
        this.contract = contract;
    }

    public String getShopperInteraction() {
        return shopperInteraction;
    }

    public void setShopperInteraction(final String shopperInteraction) {
        this.shopperInteraction = shopperInteraction;
    }

    public String getShopperStatement() {
        return shopperStatement;
    }

    public void setShopperStatement(final String shopperStatement) {
        this.shopperStatement = shopperStatement;
    }

    public Long getThreeDThreshold() {
        return threeDThreshold;
    }

    public void setThreeDThreshold(final Long threeDThreshold) {
        this.threeDThreshold = threeDThreshold;
    }

    public String getAcceptHeader() {
        return acceptHeader;
    }

    public void setAcceptHeader(final String acceptHeader) {
        this.acceptHeader = acceptHeader;
    }

    public Integer getColorDepth() {
        return colorDepth;
    }

    public void setColorDepth(Integer colorDepth) {
        this.colorDepth = colorDepth;
    }

    public Boolean getJavaEnabled() {
        return javaEnabled;
    }

    public void setJavaEnabled(Boolean javaEnabled) {
        this.javaEnabled = javaEnabled;
    }

    public Boolean getJavaScriptEnabled() {
        return javaScriptEnabled;
    }

    public void setJavaScriptEnabled(Boolean javaScriptEnabled) {
        this.javaScriptEnabled = javaScriptEnabled;
    }

    public String getBrowserLanguage() {
        return browserLanguage;
    }

    public void setBrowserLanguage(String browserLanguage) {
        this.browserLanguage = browserLanguage;
    }

    public Integer getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }

    public Integer getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    public Integer getBrowserTimeZoneOffset() {
        return browserTimeZoneOffset;
    }

    public void setBrowserTimeZoneOffset(Integer browserTimeZoneOffset) {
        this.browserTimeZoneOffset = browserTimeZoneOffset;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(final String userAgent) {
        this.userAgent = userAgent;
    }

    public String getMd() {
        return md;
    }

    public void setMd(final String md) {
        this.md = md;
    }

    public String getPaRes() {
        return paRes;
    }

    public void setPaRes(final String paRes) {
        this.paRes = paRes;
    }

    public String getMpiDataDirectoryResponse() {
        return mpiDataDirectoryResponse;
    }

    public void setMpiDataDirectoryResponse(final String mpiDataDirectoryResponse) {
        this.mpiDataDirectoryResponse = mpiDataDirectoryResponse;
    }

    public String getMpiDataAuthenticationResponse() {
        return mpiDataAuthenticationResponse;
    }

    public void setMpiDataAuthenticationResponse(final String mpiDataAuthenticationResponse) {
        this.mpiDataAuthenticationResponse = mpiDataAuthenticationResponse;
    }

    public String getMpiDataCavv() {
        return mpiDataCavv;
    }

    public void setMpiDataCavv(final String mpiDataCavv) {
        this.mpiDataCavv = mpiDataCavv;
    }

    public String getMpiDataCavvAlgorithm() {
        return mpiDataCavvAlgorithm;
    }

    public void setMpiDataCavvAlgorithm(final String mpiDataCavvAlgorithm) {
        this.mpiDataCavvAlgorithm = mpiDataCavvAlgorithm;
    }

    public String getMpiDataXid() {
        return mpiDataXid;
    }

    public void setMpiDataXid(final String mpiDataXid) {
        this.mpiDataXid = mpiDataXid;
    }

    public String getMpiDataEci() {
        return mpiDataEci;
    }

    public void setMpiDataEci(final String mpiDataEci) {
        this.mpiDataEci = mpiDataEci;
    }

    public String getMpiImplementationType() {
        return mpiImplementationType;
    }

    public void setMpiImplementationType(final String mpiImplementationType) {
        this.mpiImplementationType = mpiImplementationType;
    }

    public Map<String, String> getMpiImplementationTypeValues() {
        return mpiImplementationTypeValues;
    }

    public void setMpiImplementationTypeValues(final Map<String, String> mpiImplementationTypeValues) {
        this.mpiImplementationTypeValues = mpiImplementationTypeValues;
    }

    public String getTermUrl() {
        return termUrl;
    }

    public void setTermUrl(final String termUrl) {
        this.termUrl = termUrl;
    }

    public boolean hasThreeDS2Data() {
        return notificationUrl != null || threeDSCompInd != null || threeDSServerTransID != null ||
                threeDS2Token != null || threeDSMethodURL != null || acsTransID != null || messageVersion != null;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public String getThreeDSCompInd() {
        return threeDSCompInd;
    }

    public void setThreeDSCompInd(String threeDSCompInd) {
        this.threeDSCompInd = threeDSCompInd;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public void setAcsChallengeMandated(String acsChallengeMandated) {
        this.acsChallengeMandated = acsChallengeMandated;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public void setDsTransID(String dsTransID) {
        this.dsTransID = dsTransID;
    }

    public void setAcsReferenceNumber(String acsReferenceNumber) {
        this.acsReferenceNumber = acsReferenceNumber;
    }

    public String getThreeDSServerTransID() {
        return threeDSServerTransID;
    }

    public void setThreeDSServerTransID(String threeDSServerTransID) {
        this.threeDSServerTransID = threeDSServerTransID;
    }

    public String getThreeDS2Token() {
        return threeDS2Token;
    }

    public void setThreeDS2Token(String threeDS2Token) {
        this.threeDS2Token = threeDS2Token;
    }

    public String getThreeDSMethodURL() {
        return threeDSMethodURL;
    }

    public void setThreeDSMethodURL(String threeDSMethodURL) {
        this.threeDSMethodURL = threeDSMethodURL;
    }

    public String getAcsTransID() {
        return acsTransID;
    }

    public void setAcsTransID(String acsTransID) {
        this.acsTransID = acsTransID;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getHouseNumberOrName() {
        return houseNumberOrName;
    }

    public void setHouseNumberOrName(final String houseNumberOrName) {
        // Adyen needs houseNumberOrName to not be blank in US https://docs.adyen.com/developers/api-reference/common-api/address
        this.houseNumberOrName = houseNumberOrName != null ? houseNumberOrName : "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(final String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(final String acquirer) {
        this.acquirer = acquirer;
    }

    public String getAcquirerMID() {
        return acquirerMID;
    }

    public void setAcquirerMID(final String acquirerMID) {
        this.acquirerMID = acquirerMID;
    }

    public String getSelectedBrand() {
        return selectedBrand;
    }

    public void setSelectedBrand(final String selectedBrand) {
        this.selectedBrand = selectedBrand;
    }

    public ThreeDS2TimeFrameWithNotApplicable getAccountAgeIndicator() {
        return accountAgeIndicator;
    }

    public void setAccountAgeIndicator(ThreeDS2TimeFrameWithNotApplicable accountAgeIndicator) {
        this.accountAgeIndicator = accountAgeIndicator;
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

    public XMLGregorianCalendar getAccountChangeDate() {
        return accountChangeDate;
    }

    public void setAccountChangeDate(XMLGregorianCalendar accountChangeDate) {
        this.accountChangeDate = accountChangeDate;
    }

    public ThreeDS2TimeFrame getAccountChangeIndicator() {
        return accountChangeIndicator;
    }

    public void setAccountChangeIndicator(ThreeDS2TimeFrame accountChangeIndicator) {
        this.accountChangeIndicator = accountChangeIndicator;
    }

    public XMLGregorianCalendar getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(XMLGregorianCalendar accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public XMLGregorianCalendar getDeliveryAddressUsageDate() {
        return deliveryAddressUsageDate;
    }

    public void setDeliveryAddressUsageDate(XMLGregorianCalendar deliveryAddressUsageDate) {
        this.deliveryAddressUsageDate = deliveryAddressUsageDate;
    }

    public ThreeDS2TimeFrame getDeliveryAddressUsageIndicator() {
        return deliveryAddressUsageIndicator;
    }

    public void setDeliveryAddressUsageIndicator(ThreeDS2TimeFrame deliveryAddressUsageIndicator) {
        this.deliveryAddressUsageIndicator = deliveryAddressUsageIndicator;
    }

    public XMLGregorianCalendar getPasswordChangeDate() {
        return passwordChangeDate;
    }

    public void setPasswordChangeDate(XMLGregorianCalendar passwordChangeDate) {
        this.passwordChangeDate = passwordChangeDate;
    }

    public ThreeDS2TimeFrameWithNotApplicable getPasswordChangeIndicator() {
        return passwordChangeIndicator;
    }

    public void setPasswordChangeIndicator(ThreeDS2TimeFrameWithNotApplicable passwordChangeIndicator) {
        this.passwordChangeIndicator = passwordChangeIndicator;
    }

    public XMLGregorianCalendar getPaymentAccountAge() {
        return paymentAccountAge;
    }

    public void setPaymentAccountAge(XMLGregorianCalendar paymentAccountAge) {
        this.paymentAccountAge = paymentAccountAge;
    }

    public ThreeDS2TimeFrameWithNotApplicable getPaymentAccountIndicator() {
        return paymentAccountIndicator;
    }

    public void setPaymentAccountIndicator(ThreeDS2TimeFrameWithNotApplicable paymentAccountIndicator) {
        this.paymentAccountIndicator = paymentAccountIndicator;
    }

    public String getPasswordChangeDateIndicator() {
        return passwordChangeDateIndicator;
    }

    public void setPasswordChangeDateIndicator(String passwordChangeDateIndicator) {
        this.passwordChangeDateIndicator = passwordChangeDateIndicator;
    }

    //TODO: regenerate
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentInfo{");
        sb.append("captureDelayHours=").append(captureDelayHours);
        sb.append(", installments=").append(installments);
        sb.append(", contract='").append(contract).append('\'');
        sb.append(", shopperInteraction='").append(shopperInteraction).append('\'');
        sb.append(", shopperStatement='").append(shopperStatement).append('\'');
        sb.append(", threeDThreshold=").append(threeDThreshold);
        sb.append(", acceptHeader='").append(acceptHeader).append('\'');
        sb.append(", userAgent='").append(userAgent).append('\'');
        sb.append(", md='").append(md).append('\'');
        sb.append(", paRes='").append(paRes).append('\'');
        sb.append(", mpiDataDirectoryResponse='").append(mpiDataDirectoryResponse).append('\'');
        sb.append(", mpiDataAuthenticationResponse='").append(mpiDataAuthenticationResponse).append('\'');
        sb.append(", mpiDataCavv='").append(mpiDataCavv).append('\'');
        sb.append(", mpiDataCavvAlgorithm='").append(mpiDataCavvAlgorithm).append('\'');
        sb.append(", mpiDataXid='").append(mpiDataXid).append('\'');
        sb.append(", mpiDataEci='").append(mpiDataEci).append('\'');
        sb.append(", mpiImplementationType='").append(mpiImplementationType).append('\'');
        sb.append(", mpiImplementationTypeValues=").append(mpiImplementationTypeValues);
        sb.append(", termUrl='").append(termUrl).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", houseNumberOrName='").append(houseNumberOrName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", stateOrProvince='").append(stateOrProvince).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", acquirer='").append(acquirer).append('\'');
        sb.append(", acquirerMID='").append(acquirerMID).append('\'');
        sb.append(", selectedBrand='").append(selectedBrand).append('\'');
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

        final PaymentInfo that = (PaymentInfo) o;

        if (captureDelayHours != null ? !captureDelayHours.equals(that.captureDelayHours) : that.captureDelayHours != null) {
            return false;
        }
        if (installments != null ? !installments.equals(that.installments) : that.installments != null) {
            return false;
        }
        if (contract != null ? !contract.equals(that.contract) : that.contract != null) {
            return false;
        }
        if (shopperInteraction != null ? !shopperInteraction.equals(that.shopperInteraction) : that.shopperInteraction != null) {
            return false;
        }
        if (shopperStatement != null ? !shopperStatement.equals(that.shopperStatement) : that.shopperStatement != null) {
            return false;
        }
        if (threeDThreshold != null ? !threeDThreshold.equals(that.threeDThreshold) : that.threeDThreshold != null) {
            return false;
        }
        if (acceptHeader != null ? !acceptHeader.equals(that.acceptHeader) : that.acceptHeader != null) {
            return false;
        }
        if (userAgent != null ? !userAgent.equals(that.userAgent) : that.userAgent != null) {
            return false;
        }
        if (md != null ? !md.equals(that.md) : that.md != null) {
            return false;
        }
        if (paRes != null ? !paRes.equals(that.paRes) : that.paRes != null) {
            return false;
        }
        if (mpiDataDirectoryResponse != null ? !mpiDataDirectoryResponse.equals(that.mpiDataDirectoryResponse) : that.mpiDataDirectoryResponse != null) {
            return false;
        }
        if (mpiDataAuthenticationResponse != null ? !mpiDataAuthenticationResponse.equals(that.mpiDataAuthenticationResponse) : that.mpiDataAuthenticationResponse != null) {
            return false;
        }
        if (mpiDataCavv != null ? !mpiDataCavv.equals(that.mpiDataCavv) : that.mpiDataCavv != null) {
            return false;
        }
        if (mpiDataCavvAlgorithm != null ? !mpiDataCavvAlgorithm.equals(that.mpiDataCavvAlgorithm) : that.mpiDataCavvAlgorithm != null) {
            return false;
        }
        if (mpiDataXid != null ? !mpiDataXid.equals(that.mpiDataXid) : that.mpiDataXid != null) {
            return false;
        }
        if (mpiDataEci != null ? !mpiDataEci.equals(that.mpiDataEci) : that.mpiDataEci != null) {
            return false;
        }
        if (mpiImplementationType != null ? !mpiImplementationType.equals(that.mpiImplementationType) : that.mpiImplementationType != null) {
            return false;
        }
        if (mpiImplementationTypeValues != null ? !mpiImplementationTypeValues.equals(that.mpiImplementationTypeValues) : that.mpiImplementationTypeValues != null) {
            return false;
        }
        if (termUrl != null ? !termUrl.equals(that.termUrl) : that.termUrl != null) {
            return false;
        }
        if (street != null ? !street.equals(that.street) : that.street != null) {
            return false;
        }
        if (houseNumberOrName != null ? !houseNumberOrName.equals(that.houseNumberOrName) : that.houseNumberOrName != null) {
            return false;
        }
        if (city != null ? !city.equals(that.city) : that.city != null) {
            return false;
        }
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) {
            return false;
        }
        if (stateOrProvince != null ? !stateOrProvince.equals(that.stateOrProvince) : that.stateOrProvince != null) {
            return false;
        }
        if (country != null ? !country.equals(that.country) : that.country != null) {
            return false;
        }
        if (acquirer != null ? !acquirer.equals(that.acquirer) : that.acquirer != null) {
            return false;
        }
        if (acquirerMID != null ? !acquirerMID.equals(that.acquirerMID) : that.acquirerMID != null) {
            return false;
        }
        return selectedBrand != null ? selectedBrand.equals(that.selectedBrand) : that.selectedBrand == null;

    }

    @Override
    public int hashCode() {
        int result = captureDelayHours != null ? captureDelayHours.hashCode() : 0;
        result = 31 * result + (installments != null ? installments.hashCode() : 0);
        result = 31 * result + (contract != null ? contract.hashCode() : 0);
        result = 31 * result + (shopperInteraction != null ? shopperInteraction.hashCode() : 0);
        result = 31 * result + (shopperStatement != null ? shopperStatement.hashCode() : 0);
        result = 31 * result + (threeDThreshold != null ? threeDThreshold.hashCode() : 0);
        result = 31 * result + (acceptHeader != null ? acceptHeader.hashCode() : 0);
        result = 31 * result + (userAgent != null ? userAgent.hashCode() : 0);
        result = 31 * result + (md != null ? md.hashCode() : 0);
        result = 31 * result + (paRes != null ? paRes.hashCode() : 0);
        result = 31 * result + (mpiDataDirectoryResponse != null ? mpiDataDirectoryResponse.hashCode() : 0);
        result = 31 * result + (mpiDataAuthenticationResponse != null ? mpiDataAuthenticationResponse.hashCode() : 0);
        result = 31 * result + (mpiDataCavv != null ? mpiDataCavv.hashCode() : 0);
        result = 31 * result + (mpiDataCavvAlgorithm != null ? mpiDataCavvAlgorithm.hashCode() : 0);
        result = 31 * result + (mpiDataXid != null ? mpiDataXid.hashCode() : 0);
        result = 31 * result + (mpiDataEci != null ? mpiDataEci.hashCode() : 0);
        result = 31 * result + (mpiImplementationType != null ? mpiImplementationType.hashCode() : 0);
        result = 31 * result + (mpiImplementationTypeValues != null ? mpiImplementationTypeValues.hashCode() : 0);
        result = 31 * result + (termUrl != null ? termUrl.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (houseNumberOrName != null ? houseNumberOrName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (stateOrProvince != null ? stateOrProvince.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (acquirer != null ? acquirer.hashCode() : 0);
        result = 31 * result + (acquirerMID != null ? acquirerMID.hashCode() : 0);
        result = 31 * result + (selectedBrand != null ? selectedBrand.hashCode() : 0);
        return result;
    }
}
