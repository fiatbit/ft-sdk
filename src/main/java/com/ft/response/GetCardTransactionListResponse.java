package com.ft.response;

import com.ft.domain.ApiPage;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetCardTransactionListResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        private ApiPage page;

        private List<Transaction> list;

    }

    @Getter
    @Setter
    public static class Transaction {

        /**
         * -1 out
         * 1 in
         */
        private Integer intIoType;

        /**
         *
         */
        private String cardName;

        /**
         *
         */
        private String cardNumber;

        /**
         *
         */
        private String transactionAmount;

        /**
         *
         */
        private String transactionCurrencyCode;

        /**
         *
         */
        private Date transactionTime;

        /**
         * transaction fee
         */
        private String feeAmount;

        /**
         *
         */
        private String settleAmount;

        /**
         *
         */
        private String settleCurrencyCode;

        /**
         * transaction type
         * <p>
         * "Credit"
         * "Debit"
         * "foreign transaction fee"
         * "authorization"
         */
        private String type;

        /**
         * transaction status
         * <p>
         * "Completed"
         * "Failed"
         * "PENDING"
         * "REVERSED"
         */
        private String status;

        /**
         *
         */
        private String reason;

        /**
         *
         */
        private String merchantName;

        /**
         *
         */
        private String merchantAddress;

    }

}
