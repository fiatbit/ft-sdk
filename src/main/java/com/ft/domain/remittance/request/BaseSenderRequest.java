package com.ft.domain.remittance.request;

import com.ft.domain.remittance.response.GetRequiredFieldResponse;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * The fields actually submitted are determined according to the field list of {@link GetRequiredFieldResponse}.
 */
@Getter
@Setter
public class BaseSenderRequest {

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
     */
    @NotBlank
    private String area;

    /**
     * phone number
     */
    @NotBlank
    private String phone;

    /**
     * sender nationality
     */
    @NotBlank
    private String nationality;

    /**
     * remittance country
     */
    private String country;

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
    @NotBlank
    private String address;

    /**
     *
     */
    private String zipCode;

    /**
     * type of certificate
     */
    @NotNull
    private Integer idType;

    /**
     * ID number
     */
    @NotBlank
    private String idNumber;

    /**
     * Document issue date
     */
    @NotNull
    private Long issueDate;

    /**
     *
     */
    private Boolean isExpireDateLongTerm;

    /**
     * Certificate validity
     */
    @NotNull
    private Long expireDate;

    /**
     *
     */
    @NotNull
    private Long birthday;

    /**
     * optional: "M", "F"
     */
    @NotBlank
    private String gender;

    /**
     *
     */
    private String email;

    /**
     * payer bank account
     */
    @NotBlank
    private String accountNo;

    /**
     * custom info
     * <p>
     * max length: 50
     */
    private String remark;

}
