package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetLimitResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * Min receive amount of single order
         * <p>
         * eg: "0.01"
         */
        private String singleMin;

        /**
         * Max receive amount of single order
         * <p>
         * eg: "999999999999"
         */
        private String singleMax;

        /**
         * Max payment amount of single order
         * <p>
         * eg: "5000"
         */
        private String paySingleMax;

    }

}
