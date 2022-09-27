package com.ft.domain.remittance.response;

import com.ft.domain.remittance.domain.SenderPayload;
import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetSenderInfoResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * A list of saved payer information
         */
        private List<SenderPayload> senders;

    }

}
