package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetOrderResponse extends BaseApiResponse {

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
         * "JP"
         */
        private String country;

        /**
         *
         */
        private BigDecimal paymentAmount;

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

        /**
         *
         */
        private Integer status;

        /**
         *
         */
        private Date cancelTime;

        /**
         *
         */
        private Date createTime;

        /**
         *
         */
        private Date settleTime;

    }

}
