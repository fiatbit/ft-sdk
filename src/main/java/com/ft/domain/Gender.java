package com.ft.domain;

import lombok.Getter;

/**
 *
 */
@Getter
public enum Gender {

    /**
     *
     */
    MALE("M"),

    /**
     *
     */
    FEMALE("F"),
    ;

    private final String abbr;

    Gender(String abbr) {
        this.abbr = abbr;
    }

}
