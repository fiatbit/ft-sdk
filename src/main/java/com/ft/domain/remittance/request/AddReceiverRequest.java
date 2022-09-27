package com.ft.domain.remittance.request;

import com.ft.domain.remittance.response.GetRequiredFieldResponse;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * The fields actually submitted are determined according to the field list of {@link GetRequiredFieldResponse}.
 */
@Getter
@Setter
public class AddReceiverRequest extends BaseReceiverRequest {

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

}
