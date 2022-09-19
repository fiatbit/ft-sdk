package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardKycRequiredResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * "eg: BIN2"
         */
        private String cardTypeName;

        /**
         * 1 PASSPORT
         * 2 ID
         */
        private Integer idType;

        /**
         * Upload a scanned copy of your passport personal information page
         */
        private Boolean passportScan;

        /**
         *
         */
        private Boolean signature;

        /**
         *
         */
        private Boolean addressProof;

    }

}
