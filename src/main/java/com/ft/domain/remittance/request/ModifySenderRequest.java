package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class ModifySenderRequest extends BaseSenderRequest {

    /**
     * payer information sn
     */
    @NotBlank
    private String sn;

}
