package com.ft.domain;

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
    BUSINESS_NOT_SUPPORT(1007, "Business not support"),

    MERCHANT_STATUS_ERROR(1011, "Merchant status error"),
    MERCHANT_BALANCE_INSUFFICIENT(1012, "Balance insufficient"),
    MERCHANT_CARD_NUM_LIMIT_EXCEED(1013, "Card num limit exceed"),

    COIN_NOT_EXIST(1021, "Coin not exist"),
    EXCHANGE_QUOTATION_EXPIRED(1022, "Exchange quotation expired"),
    EXCHANGE_MIN(1023, "Exchange minimum amount insufficient"),
    EXCHANGE_MAX(1024, "Exchange maximum amount exceed"),

    CARD_NOT_EXISTS(1031, "Card not exists"),
    CARD_ADDED(1032, "Card added"),
    CARD_STATUS_ERROR(1033, "Card status error"),
    CARD_PIN_WRONG(1034, "PIN Wrong"),
    CARD_PIN_WRONG_OVER_LIMIT(1035, "PIN wrong over limit"),
    CARD_PIN_SAME(1036, "PIN same"),
    CARD_BALANCE_INSUFFICIENT(1037, "Card balance insufficient"),
    CARD_RECHARGE_MIN(1038, "Card recharge minimum amount insufficient"),
    CARD_RECHARGE_MAX(1039, "Card recharge maximum amount exceed"),
    CARD_RECHARGEABLE_LIMIT(1040, "Card rechargeable limit"),
    CARD_KYC_ID_NUMBER_DUPLICATE(1041, "idNumber duplicate"),
    CARD_KYC_NOT_EXISTS(1042, "Card KYC not exists"),
    CARD_KYC_STATUS_ERROR(1043, "Card KYC status error"),
    CARD_KYC_FIELD_MISSING(1044, "Card KYC missing"),
    CARD_KYC_UPLOAD_ERROR(1045, "Card KYC upload error"),
    CARD_KYC_UPLOAD_IMAGE_FORMAT_ERROR(1046, "Card KYC upload image format error"),
    CARD_KYC_UPLOAD_IMAGE_SIZE_EXCEED(1047, "Card KYC upload image size exceed"),

    ORDER_EXISTS(1050, "Order exists"),
    ORDER_PROCESSED(1051, "Order processed"),
    ORDER_NOT_EXISTS(1052, "Order not exists"),
    ORDER_STATUS_ERROR(1053, "Order status error"),
    ORDER_TIMEOUT(1054, "Order timeout"),
    ORDER_PLACE_ERROR(1055, "Order place error"),

    REMITTANCE_NO_SUITABLE_CHANNEL(1060, "Cannot find a suitable channel, please contact support"),
    REMITTANCE_AMOUNT_ERROR(1061, "Amount error"),
    REMITTANCE_RECEIVER_BIRTHDAY_ERROR(1062, "The birthday is under 18 years of age"),
    REMITTANCE_RECEIVER_DOCUMENT_ERROR(1063, "The documents must be expire later than today"),
    REMITTANCE_MIN_RECEIVE_AMOUNT_ERROR(1064, "Minimum receive amount insufficient"),
    REMITTANCE_MAX_RECEIVE_AMOUNT_ERROR(1065, "Maximum receive amount exceed"),
    REMITTANCE_MAX_PAYMENT_AMOUNT_ERROR(1066, "Maximum payment amount exceed"),
    REMITTANCE_RECEIVER_NOT_EXISTS(1067, "Receiver not exists"),
    REMITTANCE_SENDER_NOT_EXISTS(1068, "Sender not exists"),
    REMITTANCE_RECEIVER_CURRENCY_COUNTRY_ERROR(1069, "Receiver currency, country error"),
    REMITTANCE_SENDER_CURRENCY_COUNTRY_ERROR(1070, "Sender currency, country error"),
    ;

    private final int code;
    private final String message;

    ApiResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
