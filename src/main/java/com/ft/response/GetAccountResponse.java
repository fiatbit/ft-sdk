package com.ft.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetAccountResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         *
         */
        private List<Variety> assetList;

        /**
         *
         */
        private List<Variety> currencyList;

        /**
         *
         */
        private List<Variety> cardNumLimitList;

    }

    @Getter
    @Setter
    public static class Variety {

        /**
         * eg: "BTC", "USD", "BIN1"
         */
        private String code;

        /**
         *
         */
        private String balance;

        /**
         *
         */
        private String available;

        /**
         *
         */
        private String freeze;

    }

}
