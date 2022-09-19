package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class HandleCardBalanceRequest {

    /**
     * client order number
     * <p>
     * If there is a value, an order number is processed only once; otherwise, the system automatically generates an order number;
     * <p>
     * required: no
     * max: 32
     */
    private String clientOrderSn;

    /**
     *
     */
    @NotNull
    private String cardNumber;

    /**
     * card currency amount
     * <p>
     * eg: "1000.00", "1000"
     */
    @NotNull
    private String amount;

}
