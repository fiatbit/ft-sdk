package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetCardRechargeOrderResponse extends BaseApiResponse {

    private CardRechargeOrderPayload data;

}
