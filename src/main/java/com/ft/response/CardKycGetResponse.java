package com.ft.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardKycGetResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         *
         */
        private String cardNumber;

        /**
         * kyc status
         * <p>
         * -1 not need
         * 0 not submit
         * 1 submitted
         * 2 pass
         * 3 reject
         * 4 retry submitted
         * 5 waiting audit
         */
        private Integer kycStatus;

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

        /**
         *
         */
        private Boolean isPassportScanUploaded;

        /**
         *
         */
        private Boolean isSignatureUploaded;

        /**
         *
         */
        private Boolean isAddressProofUploaded;

        /**
         * passport scan temp url
         */
        private String passportScanUrl;

        /**
         * signature temp url
         */
        private String signatureUrl;

        /**
         * address proof temp url
         */
        private String addressProofUrl;

        /**
         * eg: "JP"
         */
        private String nation;

        /**
         * 1 PASSPORT
         * 2 ID
         */
        private Integer idType;

        /**
         * Certificate ID number
         */
        private String idNumber;

        /**
         * Certificate issue date
         */
        private Date idIssueDate;

        /**
         * Certificate validity date
         */
        private Date idExpireDate;

        /**
         *
         */
        private String address;

        /**
         *
         */
        private Date birthDate;

        /**
         *
         */
        private String realName;

        /**
         *
         */
        private String englishName;

        /**
         *
         */
        private Integer sex;

        /**
         * eg: "JP"
         */
        private String country;

        /**
         *
         */
        private String province;

        /**
         *
         */
        private String city;

        /**
         *
         */
        private String email;

        /**
         *
         */
        private String occupation;

        /**
         *
         */
        private Date kycTime;

        /**
         *
         */
        private String auditInfo;

        /**
         *
         */
        private Date submitTime;

    }

}
