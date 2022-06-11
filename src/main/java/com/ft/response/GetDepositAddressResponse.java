package com.ft.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetDepositAddressResponse extends BaseApiResponse {

    public GetDepositAddressResponse(Data data) {
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
        private String coin;

        /**
         *
         */
        private String depositAddress;

    }

}
