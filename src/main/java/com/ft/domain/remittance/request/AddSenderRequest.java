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
public class AddSenderRequest extends BaseSenderRequest {

    /**
     *
     */
    @NotBlank
    private String receiveCurrency;

    /**
     *
     */
    @NotBlank
    private String receiveCountry;

}
