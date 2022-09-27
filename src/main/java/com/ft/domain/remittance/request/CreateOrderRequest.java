package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class CreateOrderRequest {

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
     * payee information sn
     */
    @NotBlank
    private String receiverSn;

    /**
     * payer information sn, if the payee information is required for the collection currency.
     */
    private String senderSn;

    /**
     *
     */
    @NotNull
    private BigDecimal receiveAmount;

    /**
     * eg: "JP"
     */
    @NotBlank
    private String receiveCurrency;

    /**
     * eg: "JP"
     */
    @NotBlank
    private String country;

}
