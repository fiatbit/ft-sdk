package com.ft.domain.remittance.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 */
@Getter
@Setter
public class SenderPayload {

    /**
     * Payer information sn. Generated by the system when creating.
     */
    private String sn;

    /**
     *
     */
    private String receiveCurrency;

    /**
     *
     */
    private String receiveCountry;

    /**
     * Last name
     */
    private String surName;

    /**
     * First name
     */
    private String givName;

    /**
     * phone area code
     */
    private String area;

    /**
     * phone number
     */
    private String phone;

    /**
     * sender nationality
     */
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
    private String address;

    /**
     *
     */
    private String zipCode;

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
    private Date issueDate;

    /**
     *
     */
    private Boolean isExpireDateLongTerm;

    /**
     * Certificate validity
     */
    private Date expireDate;

    /**
     *
     */
    private Date birthday;

    /**
     *
     */
    private String gender;

    /**
     *
     */
    private String email;

    /**
     * payer bank account
     */
    private String accountNo;

    /**
     *
     */
    private Date createTime;

}
