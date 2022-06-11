package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GetCreateCardOrderRequest {

    /**
     * optional value: "VISA1"
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
