package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmptyResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

    }

}
