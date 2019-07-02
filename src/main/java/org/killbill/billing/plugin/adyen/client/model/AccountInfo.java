package org.killbill.billing.plugin.adyen.client.model;

public class AccountInfo {

    private String accountAgeIndicator;
    private String accountChangeDate;
    private String accountChangeIndicator;
    private String accountCreationDate;
    private String passwordChangeDate;
    private String passwordChangeDateIndicator;
    private Integer purchasesLast6Months;
    private Integer addCardAttemptsDay;
    private Integer pastTransactionsDay;
    private Integer pastTransactionsYear;
    private String paymentAccountAge;
    private String paymentAccountIndicator;
    private String deliveryAddressUsageDate;
    private String deliveryAddressUsageIndicator;
    private Boolean suspiciousActivity;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;


    public String getAccountAgeIndicator() {
        return accountAgeIndicator;
    }

    public void setAccountAgeIndicator(String accountAgeIndicator) {
        this.accountAgeIndicator = accountAgeIndicator;
    }

    public String getAccountChangeDate() {
        return accountChangeDate;
    }

    public void setAccountChangeDate(String accountChangeDate) {
        this.accountChangeDate = accountChangeDate;
    }

    public String getAccountChangeIndicator() {
        return accountChangeIndicator;
    }

    public void setAccountChangeIndicator(String accountChangeIndicator) {
        this.accountChangeIndicator = accountChangeIndicator;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public String getPasswordChangeDate() {
        return passwordChangeDate;
    }

    public void setPasswordChangeDate(String passwordChangeDate) {
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

    public String getPaymentAccountAge() {
        return paymentAccountAge;
    }

    public void setPaymentAccountAge(String paymentAccountAge) {
        this.paymentAccountAge = paymentAccountAge;
    }

    public String getPaymentAccountIndicator() {
        return paymentAccountIndicator;
    }

    public void setPaymentAccountIndicator(String paymentAccountIndicator) {
        this.paymentAccountIndicator = paymentAccountIndicator;
    }

    public String getDeliveryAddressUsageDate() {
        return deliveryAddressUsageDate;
    }

    public void setDeliveryAddressUsageDate(String deliveryAddressUsageDate) {
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
}
