package com.ft.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ApiResponseCode {

    /**
     *
     */
    OK(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase()),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED.value(), HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase()),
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS.value(), HttpStatus.TOO_MANY_REQUESTS.getReasonPhrase()),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()),

    API_KEY_NOT_EXISTS(1001, "ApiKey not exists"),
    API_UNAUTHORIZED(1002, "Api unauthorized"),
    IP_NOT_IN_THE_WHITE_LIST(1003, "IP not in the white list"),
    SIGN_ERROR(1004, "Sign error"),
    PARAMS_REQUIRED(1005, "Params required"),
    PARAMS_ERROR(1006, "Params error"),

    MERCHANT_STATUS_ERROR(1011, "Merchant status error"),
    MERCHANT_BALANCE_INSUFFICIENT(1012, "Merchant balance insufficient"),
    MERCHANT_CARD_NUM_LIMIT_EXCEED(1013, "Card num limit exceed"),

    COIN_NOT_EXIST(1021, "Coin not exist"),
    EXCHANGE_QUOTATION_EXPIRED(1022, "Exchange quotation expired"),

    CARD_NOT_EXISTS(1031, "Card not exists"),
    CARD_STATUS_ERROR(1032, "Card status error"),
    CARD_PIN_WRONG(1033, "PIN Wrong"),
    CARD_PIN_WRONG_OVER_LIMIT(1034, "PIN wrong over limit"),
    CARD_PIN_SAME(1035, "PIN same"),
    CARD_BALANCE_INSUFFICIENT(1036, "Card balance insufficient"),
    CARD_SINGLE_MAXIMUM_LIMIT_EXCEED(1037, "Single maximum limit exceed"),

    ORDER_PROCESSED(1051, "Order processed"),
    ORDER_NOT_EXISTS(1052, "Order not exists"),
    ;

    private final int code;
    private final String message;

    ApiResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
