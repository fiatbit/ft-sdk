package com.ft.domain.remittance.response;

import com.ft.response.BaseApiResponse;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GetCurrencyCountryResponse extends BaseApiResponse {

    private Data data;

    @Getter
    @Setter
    public static class Data {

        /**
         * receive currencies
         * <p>
         * eg: ["JPY", "HKD"]
         */
        private List<String> currencies;

        /**
         * countries supported by receive currency
         * <p>
         * eg: ["JPY": ["JP"]]
         */
        private Map<String, List<String>> currencyCountriesMap;

    }

}
