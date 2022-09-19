package com.ft.response;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class EnableCardResponse extends BaseApiResponse {

    private HandleCardBalanceData data;

}
