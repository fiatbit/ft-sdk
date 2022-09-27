package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class GetRequiredFieldRequest {

    /**
     * eg: "JPY"
     */
    @NotBlank
    private String currency;

    /**
     * eg: "JP"
     */
    @NotBlank
    private String country;

}
