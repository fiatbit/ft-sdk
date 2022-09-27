package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CalculateAmountResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * pay amount, exclude fee
         */
        private BigDecimal payAmount;

        /**
         *
         */
        private String paymentCurrency;

        /**
         *
         */
        private BigDecimal receiveAmount;

        /**
         *
         */
        private String receiveCurrency;

        /**
         *
         */
        private BigDecimal fee;

    }

}
