package com.ft.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExchangeResponse extends BaseApiResponse {

    public ExchangeResponse(Data data) {
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
        private String asset;

        /**
         * "USD"
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
