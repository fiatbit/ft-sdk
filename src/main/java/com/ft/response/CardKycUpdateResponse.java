package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CardKycUpdateResponse extends BaseApiResponse {

    private CardKycStatusPayload data;

}
