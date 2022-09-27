package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class GetLimitRequest {

    /**
     * eg: "JPY"
     */
    @NotBlank
    private String receiveCurrency;

    /**
     * eg: "JP"
     */
    @NotBlank
    private String country;

}
