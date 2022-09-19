package com.ft.domain;

import lombok.Getter;

@Getter
public enum IdType {

    /**
     *
     */
    PASSPORT(1),

    /**
     *
     */
    ID(2),
    ;

    private final int value;

    IdType(int value) {
        this.value = value;
    }

}
