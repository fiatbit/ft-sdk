package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class AddCardRequest {

    /**
     *
     */
    @NotNull
    private String cardNumber;

    /**
     *
     */
    @NotNull
    @Pattern(regexp = "^\\d{6}$")
    private String pin;

}
