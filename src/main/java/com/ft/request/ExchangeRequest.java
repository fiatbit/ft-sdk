package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ExchangeRequest {

    /**
     * optional value: "BTC", "ETH", "LTC", "BCH", "ETC", "XRP", "DOT", "USDT"
     */
    @NotNull
    private String asset;

    /**
     * eg: "0.1"
     */
    @NotNull
    private String payAmount;

}
