package com.ft.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardOrderPayload {

    /**
     *
     */
    private String orderSn;

    /**
     *
     */
    private String clientOrderSn;

    /**
     * "BIN1"
     */
    private String cardTypeName;

    /**
     *
     */
    private String cardNumber;

    /**
     * card currency code
     */
    private String currencyCode;

    /**
     *
     */
    private String initialAmount;

    /**
     *
     */
    private String fee;

    /**
     *
     */
    private String totalAmount;

    /**
     * valid months
     */
    private Integer limitMonth;

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     * bill address
     */
    private String billingAddress;

    /**
     * bill address, city
     */
    private String city;

    /**
     * bill address, state
     */
    private String state;

    /**
     * bill address, zip
     */
    private String zip;

    /**
     * order status
     * <p>
     * 1 PROCESSING
     * 2 SUCCESS
     * 3 FAIL
     * 4 CANCELED
     */
    private Integer status;

    /**
     *
     */
    private Date createTime;

}
