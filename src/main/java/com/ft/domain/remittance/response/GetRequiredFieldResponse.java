package com.ft.domain.remittance.response;

import com.ft.domain.remittance.domain.RequiredField;
import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.List;

/**
 * Get payer and payee required fields, which varies according to different collection currencies.
 */
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetRequiredFieldResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * Whether payer information is required.
         * <p>
         * Payee information is required for some collection currencies.
         * If true, get the required fields according to senderOrderReceiver == 1.
         *
         * @see RequiredField#senderOrReceiver
         */
        private Boolean requireSender;

        private List<RequiredField> requiredFields;

    }

}
