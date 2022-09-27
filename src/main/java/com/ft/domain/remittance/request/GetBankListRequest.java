package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class GetBankListRequest {

    /**
     * eg: "JP"
     */
    @NotBlank
    private String currency;

    /**
     * eg: "JP"
     */
    @NotBlank
    private String country;

    /**
     *
     */
    @Min(1)
    private Integer pageNum;

    /**
     *
     */
    @Min(10)
    @Max(100)
    private Integer pageSize;

}
