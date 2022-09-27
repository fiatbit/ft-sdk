package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CalculateExchangeRateResponse extends BaseApiResponse {


    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         *
         */
        private String paymentCurrency;

        /**
         *
         */
        private String receiveCurrency;

        /**
         * eg: ?USD = ?JPY
         */
        private String receiveAmount;

        /**
         *
         */
        private Date timestamp;

    }

}
