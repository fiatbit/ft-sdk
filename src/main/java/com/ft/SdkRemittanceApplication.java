package com.ft;

import com.alibaba.fastjson.JSON;
import com.ft.domain.*;
import com.ft.domain.remittance.request.*;
import com.ft.domain.remittance.response.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;

public class SdkRemittanceApplication {

    public static void main(String[] args) throws Exception {
        // getCurrencyCountry();
        // getBankList();
        // getLimit();
        // getRequiredField();
        // getReceiverInfo();
        // addReceiver();
        // modifyReceiver();
        // delReceiver();
        // getSenderInfo();
        // addSender();
        // modifySender();
        // delSender();
        // calculateExchangeRate();
        // calculateAmount();
        // createOrder();
        // getOrder();
        // getOrderList();
    }

    /**
     * A list of receive currencies, and a list of countries supported by receive currency
     */
    private static void getCurrencyCountry() throws IOException {
        final String api = "/v1/openapi/remittance/getCurrencyCountry";
        SdkClient.doRequest(api, "", GetCurrencyCountryResponse.class);
    }

    /**
     * Get bank list
     */
    private static void getBankList() throws IOException {
        final String api = "/v1/openapi/remittance/getBankList";

        final GetBankListRequest request = new GetBankListRequest();
        request.setCurrency("JPY");
        request.setCountry("JP");
        request.setPageNum(1);
        request.setPageSize(10);

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetBankListResponse.class);
    }

    /**
     * The limit of the currency that can be exchanged at one time
     */
    private static void getLimit() throws IOException {
        final String api = "/v1/openapi/remittance/getLimit";

        final GetLimitRequest request = new GetLimitRequest();
        request.setReceiveCurrency("JPY");
        request.setCountry("JP");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetLimitResponse.class);
    }

    /**
     * Get a list of fields required for payee information and payer information.
     * <p>
     * Payer information is required for some currencies.
     * Fields required are varies by currency and country.
     * Therefore, when adding a payee or a payer, need to ensure that the fields required have values.
     */
    private static void getRequiredField() throws IOException {
        final String api = "/v1/openapi/remittance/getRequiredField";

        final GetRequiredFieldRequest request = new GetRequiredFieldRequest();
        request.setCurrency("JPY");
        request.setCountry("JP");

        // required for some currencies
        // request.setCurrency("AUD");
        // request.setCountry("AU");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetRequiredFieldResponse.class);
    }

    /**
     * Get a list of saved payee information.
     */
    private static void getReceiverInfo() throws IOException {
        final String api = "/v1/openapi/remittance/getReceiverInfo";

        final GetSenderOrReceiverInfoRequest request = new GetSenderOrReceiverInfoRequest();
        request.setCurrency("JPY");
        request.setCountry("JP");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetReceiverInfoResponse.class);
    }

    /**
     * Add payee information
     */
    private static void addReceiver() throws IOException, ParseException {
        final String api = "/v1/openapi/remittance/addReceiver";

        final AddReceiverRequest request = new AddReceiverRequest();
        request.setCurrency("JPY");
        request.setCountry("JP");
        request.setSurName("Tko");
        request.setGivName("Tesla");
        request.setArea("81");
        request.setPhone("602776508");
        request.setNationality("JP");
        request.setLocationId("3383");
        request.setBankId("3383");
        request.setBankName("Gunma Bank");
        request.setBankBranchCode("890");
        request.setAccountNo("612987099889");

        // required for some currencies
        request.setCurrency("AUD");
        request.setCountry("AU");
        request.setIdType(IdType.PASSPORT.getValue());
        request.setIdNumber("612987099889");
        request.setIssueDate(DateUtils.parseDate("2020-11-02", "yyyy-MM-dd").getTime());
        request.setExpireDate(DateUtils.parseDate("2025-11-02", "yyyy-MM-dd").getTime());
        request.setZipCode("600278");
        request.setStates("BA");
        request.setCity("NORTH");
        request.setAddress("NAN");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, AddReceiverResponse.class);
    }

    /**
     * Modify payee information
     */
    private static void modifyReceiver() throws IOException, ParseException {
        final String api = "/v1/openapi/remittance/modifyReceiver";

        final ModifyReceiverRequest request = new ModifyReceiverRequest();
        request.setSn("6ee25e20387eda2502ea8a39328ad323");
        request.setSurName("Tko");
        request.setGivName("Tesla");
        request.setArea("81");
        request.setPhone("602776508");
        request.setNationality("JP");
        request.setLocationId("3383");
        request.setBankId("3383");
        request.setBankName("Gunma Bank");
        request.setBankBranchCode("567");
        request.setAccountNo("882987099889");

        request.setSn("44467d44293595da71df8d01cddb979d");
        request.setIdType(IdType.PASSPORT.getValue());
        request.setIdNumber("612987099889");
        request.setIssueDate(DateUtils.parseDate("2020-11-02", "yyyy-MM-dd").getTime());
        request.setExpireDate(DateUtils.parseDate("2025-11-02", "yyyy-MM-dd").getTime());
        request.setZipCode("600278");
        request.setStates("BA");
        request.setCity("NORTH");
        request.setAddress("NAN");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, EmptyResponse.class);
    }

    /**
     * Delete payee information
     */
    private static void delReceiver() throws IOException {
        final String api = "/v1/openapi/remittance/delReceiver";

        final SnRequest request = new SnRequest();
        request.setSn("f66e90315a45b1296fb3b944e825fe1d");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, EmptyResponse.class);
    }

    /**
     * Get a list of saved payer information.
     */
    private static void getSenderInfo() throws IOException {
        final String api = "/v1/openapi/remittance/getSenderInfo";

        final GetSenderOrReceiverInfoRequest request = new GetSenderOrReceiverInfoRequest();
        request.setCurrency("JPY");
        request.setCountry("JP");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetSenderInfoResponse.class);
    }

    /**
     * Add payer information
     */
    private static void addSender() throws IOException, ParseException {
        final String api = "/v1/openapi/remittance/addSender";

        final AddSenderRequest request = new AddSenderRequest();
        request.setReceiveCurrency("AUD");
        request.setReceiveCountry("AU");
        request.setSurName("Tko");
        request.setGivName("Tesla");
        request.setArea("81");
        request.setPhone("602776508");
        request.setNationality("JP");
        request.setCity("Tokyo");
        request.setAddress("Three items");
        request.setIdType(IdType.PASSPORT.getValue());
        request.setIdNumber("612987099889");
        request.setIssueDate(DateUtils.parseDate("2020-11-02", "yyyy-MM-dd").getTime());
        request.setExpireDate(DateUtils.parseDate("2025-11-02", "yyyy-MM-dd").getTime());
        request.setBirthday(DateUtils.parseDate("2000-01-02", "yyyy-MM-dd").getTime());
        request.setGender(Gender.MALE.getAbbr());
        request.setAccountNo("612987099889");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, AddReceiverResponse.class);
    }

    /**
     * modify payer information
     */
    private static void modifySender() throws IOException, ParseException {
        final String api = "/v1/openapi/remittance/modifySender";

        final ModifySenderRequest request = new ModifySenderRequest();
        request.setSn("77ff4231ca31476a71612e6e99fcdd7d");
        request.setSurName("Toko");
        request.setGivName("Nana");
        request.setArea("81");
        request.setPhone("602776508");
        request.setNationality("JP");
        request.setCity("Tokyo");
        request.setAddress("Two items");
        request.setIdType(IdType.PASSPORT.getValue());
        request.setIdNumber("612987099889");
        request.setIssueDate(DateUtils.parseDate("2020-11-02", "yyyy-MM-dd").getTime());
        request.setExpireDate(DateUtils.parseDate("2025-11-02", "yyyy-MM-dd").getTime());
        request.setBirthday(DateUtils.parseDate("2000-01-02", "yyyy-MM-dd").getTime());
        request.setGender(Gender.MALE.getAbbr());
        request.setAccountNo("612987099889");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, AddReceiverResponse.class);
    }

    /**
     * Delete payer information
     */
    private static void delSender() throws IOException {
        final String api = "/v1/openapi/remittance/delSender";

        final SnRequest request = new SnRequest();
        request.setSn("77ff4231ca31476a71612e6e99fcdd7d");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, EmptyResponse.class);
    }

    /**
     * Calculate the exchange rate, without fee.
     */
    private static void calculateExchangeRate() throws IOException {
        final String api = "/v1/openapi/remittance/calculateExchangeRate";

        final CalculateExchangeRateRequest request = new CalculateExchangeRateRequest();
        request.setReceiveCurrency("JPY");
        request.setCountry("JP");
        request.setLocationId(null);

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, CalculateExchangeRateResponse.class);
    }

    /**
     * Calculate the exchange rate.
     * <p>
     * Due to exchange rate fluctuations, There may be a little different result in the actual order.
     */
    private static void calculateAmount() throws IOException {
        final String api = "/v1/openapi/remittance/calculateAmount";

        final CalculateAmountRequest request = new CalculateAmountRequest();
        request.setAmount("");
        request.setReceiveAmount("1000");
        request.setReceiveCurrency("JPY");
        request.setCountry("JP");
        request.setLocationId(null);

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, CalculateAmountResponse.class);
    }

    /**
     * Create order
     */
    private static void createOrder() throws IOException {
        final String api = "/v1/openapi/remittance/createOrder";

        final CreateOrderRequest request = new CreateOrderRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setReceiverSn("b1aa0d513f069c08626e32374cc5fee9");
        request.setReceiveAmount(new BigDecimal("1000"));
        request.setReceiveCurrency("JPY");
        request.setCountry("JP");

        // required for some currencies
        // request.setReceiverSn("a9646b2e1966a023197d1db1973f7d08");
        // request.setSenderSn("4506bb42a3c1cc7e21f9c1ca089bbdf3");
        // request.setReceiveAmount(new BigDecimal("1000"));
        // request.setReceiveCurrency("AUD");
        // request.setCountry("AU");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, CreateOrderResponse.class);
    }

    /**
     * Get order detail
     */
    private static void getOrder() throws IOException {
        final String api = "/v1/openapi/remittance/getOrder";

        final OrderSnRequest request = new OrderSnRequest();
        request.setClientOrderSn("fiTejY5Tj9L0CvtNonFqs3dlAegHPThz");
        request.setOrderSn("");

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, CreateOrderResponse.class);
    }

    /**
     * Get order list
     * <p>
     * status {@link Status}
     */
    private static void getOrderList() throws IOException, ParseException {
        final String api = "/v1/openapi/remittance/getOrderList";

        final GetOrderListRequest request = new GetOrderListRequest();
        // request.setStatus(1);
        request.setPageNum(1);
        request.setPageSize(10);
        request.setStartTime(DateUtils.parseDate("2022-01-01", "yyyy-MM-dd").getTime());
        request.setEndTime(null);

        final String json = JSON.toJSONString(request);
        SdkClient.doRequest(api, json, GetOrderListResponse.class);
    }

}
