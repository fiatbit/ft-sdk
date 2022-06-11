package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GetDepositAddressRequest {

    /**
     * optional value: "BTC", "ETH", "LTC", "BCH", "ETC", "XRP", "DOT", "USDT_TRC20", "USDT_ERC20", "USDT_OMNI"
     */
    @NotNull
    private String coin;

}
