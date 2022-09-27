package com.ft.domain.remittance.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Get payer and payee required fields, which varies according to different collection currencies.
 */
@Getter
@Setter
public class RequiredField {

    /**
     * 1: sender, 2: receiver
     */
    private Integer senderOrReceiver;

    /**
     * eg: "phone"
     */
    private String field;

    /**
     * eg: 1
     */
    private Integer required;

    /**
     * eg: 60
     */
    private Integer maxLength;

}
