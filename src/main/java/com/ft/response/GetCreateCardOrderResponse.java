package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetCreateCardOrderResponse extends BaseApiResponse {

    private CardOrderPayload data;

}
