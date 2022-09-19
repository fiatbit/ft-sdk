package com.ft.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardRechargeOrderPayload {

    /**
     *
     */
    private String orderSn;

    /**
     *
     */
    private String clientOrderSn;

    /**
     *
     */
    private String cardTypeName;

    /**
     *
     */
    private String cardNumber;

    /**
     *
     */
    private String currencyCode;

    /**
     *
     */
    private String totalAmount;

    /**
     *
     */
    private String fee;

    /**
     *
     */
    private String actualAmount;

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
     * Whether to initialize the card balance when applying for a card.
     * <p>
     * eg: 0 false, 1 true
     */
    private Integer isFirst;

    /**
     *
     */
    private Date settleTime;

    /**
     *
     */
    private Date createTime;

}
