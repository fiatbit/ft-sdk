package com.ft.domain;

import lombok.Getter;

@Getter
public enum Status {

    /**
     * Order created, waiting for confirmation
     */
    FREEZE(0),

    /**
     * Confirmed, waiting for bank processing
     */
    CONFIRM(1),

    /**
     * Final status, order successful
     */
    SUCCESS(2),

    /**
     * Final status, there is a problem with the order failed
     */
    FAIL(3),

    /**
     * Final status, active cancellation, order cancellation
     */
    CANCEL(4),

    /**
     * Exception, please contact support
     */
    ERROR(5),
    ;

    private final int value;

    Status(int value) {
        this.value = value;
    }

}
