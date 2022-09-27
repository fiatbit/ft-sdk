package com.ft.domain.remittance.request;

import com.ft.domain.remittance.response.GetRequiredFieldResponse;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * The fields actually submitted are determined according to the field list of {@link GetRequiredFieldResponse}.
 */
@Getter
@Setter
public class BaseReceiverRequest {

    /**
     * Last name
     */
    @NotBlank
    private String surName;

    /**
     * First name
     */
    @NotBlank
    private String givName;

    /**
     * phone area code
     * <p>
     * eg: "81"
     */
    @NotBlank
    private String area;

    /**
     * phone number
     * <p>
     * eg: "602776508"
     */
    @NotBlank
    private String phone;

    /**
     * receiver nationality
     */
    private String nationality;

    /**
     * bank location id
     */
    @NotBlank
    private String locationId;

    /**
     *
     */
    @NotBlank
    private String bankId;

    /**
     *
     */
    @NotBlank
    private String bankName;

    /**
     * branch code BSB/IBAN etc.
     */
    private String bankBranchCode;

    /**
     *
     */
    private String bankBranchName;

    /**
     * bank account
     */
    @NotBlank
    private String accountNo;

    /**
     *
     */
    private String accountType;

    /**
     * Bank reserved mobile phone number
     */
    private String bankMobile;

    /**
     * type of certificate
     */
    private Integer idType;

    /**
     * ID number
     */
    private String idNumber;

    /**
     * Document issue date
     */
    private Long issueDate;

    /**
     *
     */
    private Boolean isExpireDateLongTerm;

    /**
     * Certificate validity
     */
    private Long expireDate;

    /**
     * Certificate issuing authority
     */
    private String licIssuAutho;

    /**
     *
     */
    private Long birthday;

    /**
     * optional: "M", "F"
     */
    private String gender;

    /**
     *
     */
    private String states;

    /**
     *
     */
    private String city;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private String zipCode;

    /**
     *
     */
    private String middleName;

    /**
     *
     */
    private String otherName;

    /**
     * custom info
     * <p>
     * max length: 50
     */
    private String remark;

}
