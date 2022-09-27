package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class CalculateAmountRequest {

    /**
     * amount or receiveAmount only one can be submitted
     */
    private String amount;

    /**
     * amount or receiveAmount only one can be submitted
     */
    private String receiveAmount;

    /**
     *
     */
    @NotBlank
    private String receiveCurrency;

    /**
     *
     */
    @NotBlank
    private String country;

    /**
     * Bank location id
     * <p>
     * If null, system will give a default locationId of the receiveCurrency and country, but there may be a little different result;
     * Therefore, when the user select the payee, please send the locationId of the payee information.
     * <p>
     * eg: "3383"
     */
    private String locationId;

}
