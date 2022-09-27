package com.ft.domain.remittance.response;

import com.ft.domain.remittance.domain.ReceiverPayload;
import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetReceiverInfoResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * A list of saved payee information
         */
        private List<ReceiverPayload> receivers;

    }

}
