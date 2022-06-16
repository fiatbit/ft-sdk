package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * eg: "BTC", "ETH", "USDT"
         */
        private String asset;

        /**
         * eg: "USD"
         */
        private String quoteAsset;

        /**
         *
         */
        private String payAmount;

        /**
         *
         */
        private String receiveAmount;

    }

}
