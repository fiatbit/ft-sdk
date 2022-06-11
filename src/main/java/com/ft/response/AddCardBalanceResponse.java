package com.ft.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddCardBalanceResponse extends BaseApiResponse {

    public AddCardBalanceResponse(Data data) {
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
        private String clientOrderSn;

        /**
         *
         */
        private String orderSn;

        /**
         *
         */
        private String cardNumber;

        /**
         *
         */
        private String amount;

    }

}
