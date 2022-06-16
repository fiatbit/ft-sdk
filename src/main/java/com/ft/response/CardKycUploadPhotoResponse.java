package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardKycUploadPhotoResponse extends BaseApiResponse {

    private CardKycStatusPayload data;

}
