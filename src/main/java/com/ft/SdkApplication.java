package com.ft;

import com.alibaba.fastjson.JSON;
import com.ft.request.*;
import com.ft.response.*;
import com.ft.util.AesUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

@Slf4j
public class SdkApplication {

    public static void main(String[] args) throws Exception {
        getAccount();
        // getDepositAddress();
        // exchange();
        // createCard();
        // getCreatOrder();
        // getDetail();
        // addBalance();
        // getCardTransactionList();
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
        request.setAsset("USDT");
        request.setPayAmount("100");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, ExchangeResponse.class);
    }

    private static void createCard() throws IOException {
        final String api = "/v1/openapi/card/VISA1/create";

        final CreateCardRequest request = new CreateCardRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setCardTypeName("VISA1");
        request.setInitialAmount("10");
        request.setFirstName("Judy");
        request.setLastName("Pt");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, CreateCardResponse.class);
    }

    private static void getCreatOrder() throws IOException {
        final String api = "/v1/openapi/card/VISA1/getCreateOrder";

        final GetCreateCardOrderRequest request = new GetCreateCardOrderRequest();
        request.setCardTypeName("VISA1");
        request.setClientOrderSn(null);
        request.setOrderSn("CC20220607163625XnMVN0R50PQyzOZD");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, GetCreateCardOrderResponse.class);
    }

    private static void getDetail() throws Exception {
        final String api = "/v1/openapi/card/VISA1/getDetail";

        final GetCardDetailRequest request = new GetCardDetailRequest();
        request.setCardNumber("9003504801710130");
        final String json = JSON.toJSONString(request);

        final GetCardDetailResponse response = SdkClient.doRequest(api, json, GetCardDetailResponse.class);
        final GetCardDetailResponse.Data data = response.getData();
        final String cvv = data.getCvv();
        final String decryptedCvv = AesUtil.decrypt(cvv, data.getCardNumber() + data.getTs());
        log.info("{} -> {}", cvv, decryptedCvv);
    }

    private static void addBalance() throws IOException {
        final String api = "/v1/openapi/card/VISA1/addBalance";

        final AddCardBalanceRequest request = new AddCardBalanceRequest();
        request.setClientOrderSn(RandomStringUtils.randomAlphanumeric(32));
        request.setCardNumber("9003504801710130");
        request.setAmount("100");
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, AddCardBalanceResponse.class);
    }

    private static void getCardTransactionList() throws IOException {
        final String api = "/v1/openapi/card/VISA1/getTransactionList";

        final GetCardTransactionListRequest request = new GetCardTransactionListRequest();
        request.setCardNumber("9003504801710130");
        request.setPageNum(1);
        request.setPageSize(10);
        request.setStartTime(null);
        request.setEndTime(null);
        final String json = JSON.toJSONString(request);

        SdkClient.doRequest(api, json, GetCardTransactionListResponse.class);
    }

}
