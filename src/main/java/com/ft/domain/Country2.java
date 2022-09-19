package com.ft.domain;

import lombok.Getter;

/**
 * ISO
 */
@Getter
public enum Country2 {

    /**
     *
     */
    US,
    JP,
    ;

    Country2() {
    }

    public String getCode() {
        return name();
    }

}
