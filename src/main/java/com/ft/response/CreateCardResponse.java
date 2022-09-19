package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CreateCardResponse extends BaseApiResponse {

    private CardOrderPayload data;

}
