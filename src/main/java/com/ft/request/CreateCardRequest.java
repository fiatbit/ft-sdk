package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateCardRequest {

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
     * optional value: "BIN1"
     */
    @NotNull
    private String cardTypeName;

    /**
     * initial amount
     * <p>
     * min: 10USD
     */
    @NotNull
    private String initialAmount;

    /**
     *
     */
    @NotNull
    private String firstName;

    /**
     *
     */
    @NotNull
    private String lastName;

}
