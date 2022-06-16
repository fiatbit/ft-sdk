package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class HandleCardBalanceData {

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
    private Integer status;

    /**
     *
     */
    private String cardNumber;

    /**
     *
     */
    private String quoteAmount;

    /**
     *
     */
    private String quoteCurrencyCode;

    /**
     *
     */
    private String settleAmount;

    /**
     *
     */
    private String settleFee;

    /**
     *
     */
    private String settleCurrencyCode;

}
