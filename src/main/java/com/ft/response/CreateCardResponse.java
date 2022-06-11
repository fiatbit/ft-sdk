package com.ft.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCardResponse extends BaseApiResponse {

    public CreateCardResponse(Data data) {
        super();
        this.data = data;
    }

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * client order number
         */
        private String clientOrderSn;

        /**
         * system order number
         */
        private String orderSn;

    }

}
