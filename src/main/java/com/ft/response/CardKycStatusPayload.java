package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardKycStatusPayload {

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

}
