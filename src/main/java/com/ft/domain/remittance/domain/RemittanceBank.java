package com.ft.domain.remittance.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
public class RemittanceBank {

    /**
     * bank location id
     * <p>
     * eg: "3383"
     */
    private String locationId;

    /**
     * eg: "3383"
     */
    private String bankId;

    /**
     * eg: "Gunma Bank"
     */
    private String bankName;

    /**
     * bank branch name
     * <p>
     * eg: "Japan Gunma Bank"
     */
    private String bankBranch;

    /**
     * eg: "Japan Gunma Bank"
     */
    private String address;

    /**
     * eg: "Japan"
     */
    private String city;

    /**
     * eg: "JPY"
     */
    private String currency;

    /**
     * eg: "JP"
     */
    private String countryCode;

}
