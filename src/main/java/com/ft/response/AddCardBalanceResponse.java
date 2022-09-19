package com.ft.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddCardBalanceResponse extends BaseApiResponse {

    private HandleCardBalanceData data;

}
