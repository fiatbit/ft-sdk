package com.ft.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 */
@Getter
@Setter
public class SnRequest {

    /**
     *
     */
    @NotBlank
    private String sn;

}