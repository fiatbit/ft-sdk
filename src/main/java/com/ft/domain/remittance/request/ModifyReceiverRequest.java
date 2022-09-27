package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class ModifyReceiverRequest extends BaseReceiverRequest {

    /**
     * payee information sn
     */
    @NotBlank
    private String sn;

}
