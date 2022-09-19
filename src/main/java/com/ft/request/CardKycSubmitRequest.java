package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CardKycSubmitRequest {

    /**
     *
     */
    @NotNull
    private String cardNumber;

}
