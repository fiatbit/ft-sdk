package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AddSenderResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * new payer information sn
         */
        private String sn;

    }

}
