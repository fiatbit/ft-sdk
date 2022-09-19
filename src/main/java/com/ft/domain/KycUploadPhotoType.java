package com.ft.domain;

import lombok.Getter;

@Getter
public enum KycUploadPhotoType {

    /**
     *
     */
    PASSPORT_SCAN(1),

    /**
     *
     */
    SIGNATURE(2),

    /**
     *
     */
    ADDRESS_PROOF(3),
    ;

    private final int value;

    KycUploadPhotoType(int value) {
        this.value = value;
    }

}
