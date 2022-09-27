package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AddReceiverResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * new payee information sn
         */
        private String sn;

    }

}
