package com.ft;

import com.alibaba.fastjson.JSON;
import com.ft.domain.Country2;
import com.ft.domain.IdType;
import com.ft.domain.KycUploadPhotoType;
import com.ft.request.*;
import com.ft.response.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Base64Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Objects;

@Slf4j
public class SdkApplication {

    private static final String VISA_1 = "VISA1";
    private static final String AMEX_1 = "AMEX1";

    /**
     * @see doc/card_amex1.txt
     */
    private static final String AMEX_1_NEW_CARD_NUMBER = "800687938859832";

    public static void main(String[] args) throws Exception {
        // account
        // getAccount();

        // coin
        // getDepositAddress();
        // exchange();

        // card/VISA1, USD
        // createCard(VISA_1);
        // getCreatOrder(VISA_1);
        // getDetail(VISA_1);
        // addBalance(VISA_1);
        // getCardTransactionList(VISA_1);

        // card/AMEX1, HKD
        // addCard(AMEX_1);
        // getDetail(AMEX_1);
        // enableCard(AMEX_1);
        // kycRequired(AMEX_1);
        // kycGet(AMEX_1);
        // kycUpdate(AMEX_1);
        // kycUploadPhoto(AMEX_1);
        // kycSubmit(AMEX_1);
        // addBalance(AMEX_1);
        // getCardTransactionList(AMEX_1);
    }

    private static void getAccount() throws IOException {
        final String api = "/v1/openapi/account";
        SdkClient.doRequest(api, "", GetAccountResponse.class);
    }

    /**
     * only for test api, don't deposit to the returned address.
     */
    private static void getDepositAddress() throws IOException {
        final String api = "/v1/openapi/coin/getDepositAddress";

        final GetDepositAddressRequest request = new GetDepositAddressRequest();
        request.setCoin("USDT_ERC20");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, GetDepositAddressResponse.class);
    }


    private static void exchange() throws IOException {
        final String api = "/v1/openapi/coin/exchange";

        final ExchangeRequest request = new ExchangeRequest();
        // request.setAsset("BTC");
        // request.setPayAmount("0.01");
        request.setAsset("USDT");
        request.setPayAmount("100");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, ExchangeResponse.class);
    }

    private static void createCard(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/create", cardTypeName);

        final CreateCardRequest request = new CreateCardRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setCardTypeName(cardTypeName);
        request.setInitialAmount("10");
        request.setFirstName("Judy" + RandomStringUtils.randomAlphanumeric(3));
        request.setLastName("Pt");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CreateCardResponse.class);
    }

    private static void getCreatOrder(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/getCreateOrder", cardTypeName);

        final GetCreateCardOrderRequest request = new GetCreateCardOrderRequest();
        request.setCardTypeName(cardTypeName);
        request.setClientOrderSn(null);
        request.setOrderSn("CC20220607163625XnMVN0R50PQyzOZD");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, GetCreateCardOrderResponse.class);
    }

    private static void getDetail(String cardTypeName) throws Exception {
        final String api = String.format("/v1/openapi/card/%s/getDetail", cardTypeName);

        final GetCardDetailRequest request = new GetCardDetailRequest();
        request.setCardNumber(getCardNumber(cardTypeName));
        final String json = JSON.toJSONString(request);

        final GetCardDetailResponse response = SdkClient.doRequest(api, json, GetCardDetailResponse.class);

        final GetCardDetailResponse.Data data = response.getData();
        if (Objects.equals(cardTypeName, VISA_1)) {
            final String cvv = data.getCvv();
            final String decryptedCvv = SdkClient.decrypt(cvv, data.getCardNumber() + data.getTs());
            log.info("{} -> {}", cvv, decryptedCvv);
        }
    }

    private static String getCardNumber(String cardTypeName) {
        String cardNumber = null;
        if (Objects.equals(cardTypeName, VISA_1)) {
            cardNumber = "9003504801710130";
        } else if (Objects.equals(cardTypeName, AMEX_1)) {
            cardNumber = AMEX_1_NEW_CARD_NUMBER;
        }
        return cardNumber;
    }

    private static void addBalance(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/addBalance", cardTypeName);

        final AddCardBalanceRequest request = new AddCardBalanceRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setCardNumber(getCardNumber(cardTypeName));
        request.setAmount("100");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, AddCardBalanceResponse.class);
    }

    private static void getCardTransactionList(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/getTransactionList", cardTypeName);

        final GetCardTransactionListRequest request = new GetCardTransactionListRequest();
        request.setCardNumber(getCardNumber(cardTypeName));
        request.setPageNum(1);
        request.setPageSize(10);
        request.setStartTime(null);
        request.setEndTime(null);
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, GetCardTransactionListResponse.class);
    }

    private static void addCard(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/addCard", cardTypeName);

        final AddCardRequest request = new AddCardRequest();
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        request.setPin("065261");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, AddCardResponse.class);
    }

    private static void enableCard(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/enableCard", cardTypeName);

        final EnableCardRequest request = new EnableCardRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        request.setInitialAmount("500");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, EnableCardResponse.class);
    }

    private static void kycRequired(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/kyc/required", cardTypeName);

        final CardKycRequiredRequest request = new CardKycRequiredRequest();
        request.setCountryCode(Country2.JP.getCode());
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CardKycRequiredResponse.class);
    }

    private static void kycGet(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/kyc/get", cardTypeName);

        final CardKycGetRequest request = new CardKycGetRequest();
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CardKycGetResponse.class);
    }

    private static void kycUpdate(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/kyc/update", cardTypeName);

        // fill real value
        final CardKycUpdateRequest request = new CardKycUpdateRequest();
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        request.setCountryCode(Country2.JP.getCode());
        request.setIdType(IdType.PASSPORT.getValue());
        request.setIdNumber(RandomStringUtils.randomAlphanumeric(10));
        request.setIdIssueDate(System.currentTimeMillis());
        request.setIdExpireDate(DateUtils.addYears(new Date(), 1).getTime());
        request.setBirthday(System.currentTimeMillis());
        request.setRealName("BULL TOK");
        request.setEnglishName("Bull Tok");
        request.setGender("M");
        request.setProvince("real province");
        request.setCity("real city");
        request.setAddress("real address");
        request.setEmail("bull@gmail.com");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CardKycUpdateResponse.class);
    }

    private static void kycUploadPhoto(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/kyc/uploadPhoto", cardTypeName);

        // fill real value
        final InputStream png = new ClassPathResource("demo.png").getInputStream();
        final String photo = Base64Utils.encodeToString(IOUtils.toByteArray(png));

        final CardKycUploadPhotoRequest request = new CardKycUploadPhotoRequest();
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        request.setUploadPhotoType(KycUploadPhotoType.PASSPORT_SCAN.getValue());
        // request.setUploadPhotoType(KycUploadPhotoType.SIGNATURE.getValue());
        // request.setUploadPhotoType(KycUploadPhotoType.ADDRESS_PROOF.getValue());
        request.setPhoto(photo);
        request.setMimeType("image/png");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CardKycUpdateResponse.class);
    }

    private static void kycSubmit(String cardTypeName) throws IOException {
        final String api = String.format("/v1/openapi/card/%s/kyc/submit", cardTypeName);

        final CardKycSubmitRequest request = new CardKycSubmitRequest();
        request.setCardNumber(AMEX_1_NEW_CARD_NUMBER);
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CardKycSubmitResponse.class);
    }

}
