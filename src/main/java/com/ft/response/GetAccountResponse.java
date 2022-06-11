package com.ft.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GetAccountResponse extends BaseApiResponse {

    public GetAccountResponse(Data data) {
        super();
        this.data = data;
    }

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
         * eg: BTC, USD, VISA1
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
