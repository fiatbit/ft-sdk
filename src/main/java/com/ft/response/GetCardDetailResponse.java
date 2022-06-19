package com.ft.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetCardDetailResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * "BIN1"
         */
        private String cardTypeName;

        /**
         *
         */
        private String cardNumber;

        /**
         * card currency code
         */
        private String currencyCode;

        /**
         * total balance
         */
        private String balance;

        /**
         * available amount
         */
        private String available;

        /**
         * frozen amount
         */
        private String freeze;

        /**
         * MMYY
         */
        private String expiration;

        /**
         *
         */
        private String cvv;

        /**
         *
         */
        private String firstName;

        /**
         *
         */
        private String lastName;

        /**
         * billing address
         */
        private String billingAddress;

        /**
         * bill address, city
         */
        private String city;

        /**
         * bill address, state
         */
        private String state;

        /**
         * bill address, zip
         */
        private String zip;

        /**
         * 0 not enabled
         * 1 normal
         * 2 card printing
         * 3 locked
         * 4 loss
         * 5 stolen
         * 6 frozen
         * 7 cancel
         */
        private Integer cardStatus;

        /**
         *
         */
        private Boolean isEnable;

        /**
         * opening time
         */
        private Date issueTime;

        /**
         *
         */
        private Long ts;

    }

}
