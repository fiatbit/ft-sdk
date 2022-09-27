package com.ft.domain.remittance.response;

import com.ft.domain.ApiPage;
import com.ft.domain.remittance.domain.RemittanceBank;
import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetBankListResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        private ApiPage page;

        private List<RemittanceBank> list;

    }

}
