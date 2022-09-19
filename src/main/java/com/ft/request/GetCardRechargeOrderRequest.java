package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GetCardRechargeOrderRequest {

    /**
     * optional value: "BIN1"
     */
    @NotNull
    private String cardTypeName;

    /**
     *
     */
    private String clientOrderSn;

    /**
     *
     */
    private String orderSn;

}
