package com.ft.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
public class OrderSnRequest {

    /**
     * One of them must have a value
     */
    private String clientOrderSn;

    /**
     * One of them must have a value
     */
    private String orderSn;

}