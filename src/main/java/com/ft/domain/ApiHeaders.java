package com.ft.domain;

import lombok.Getter;

@Getter
public enum ApiHeaders {

    /**
     *
     */
    API_KEY("x-api-key"),
    NONCE("x-nonce"),
    TIMESTAMP("x-ts"),
    SIGN("x-sign"),
    ;

    private final String name;

    ApiHeaders(String name) {
        this.name = name;
    }

}
