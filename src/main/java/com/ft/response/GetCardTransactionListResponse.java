package com.ft.response;

import com.ft.domain.ApiPage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GetCardTransactionListResponse extends BaseApiResponse {

    public GetCardTransactionListResponse(Data data) {
        super();
        this.data = data;
    }

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
        private Long transactionTime;

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
