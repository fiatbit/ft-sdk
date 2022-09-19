package com.ft.request;

import com.ft.domain.KycUploadPhotoType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CardKycUploadPhotoRequest {

    /**
     *
     */
    @NotNull
    private String cardNumber;

    /**
     * @see KycUploadPhotoType
     */
    private Integer uploadPhotoType;

    /**
     * upload photo
     * <p>
     * base64(image bytes)
     */
    @NotNull
    private String photo;

    /**
     * eg: "image/jpeg", "image/png"
     */
    @NotNull
    private String mimeType;

}
