package com.ft.request;

import com.ft.domain.Country2;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardKycRequiredRequest {

    /**
     * @see Country2
     */
    private String countryCode;

}
