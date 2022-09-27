package com.ft.domain;

import lombok.Getter;

@Getter
public enum IdType {

    /**
     *
     */
    ID(1),

    /**
     *
     */
    PASSPORT(2),
    ;

    private final int value;

    IdType(int value) {
        this.value = value;
    }

}
