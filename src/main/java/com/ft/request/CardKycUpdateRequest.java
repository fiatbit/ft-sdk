package com.ft.request;

import com.ft.domain.Country2;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CardKycUpdateRequest {

    /**
     *
     */
    @NotNull
    private String cardNumber;

    /**
     * @see Country2
     */
    @NotNull
    private String countryCode;

    /**
     * 1: PASSPORT
     */
    @NotNull
    private Integer idType;

    /**
     * ID number
     */
    @NotNull
    private String idNumber;

    /**
     * Date of issue
     */
    @NotNull
    private Long idIssueDate;

    /**
     * Date of expiry
     */
    @NotNull
    private Long idExpireDate;

    /**
     *
     */
    @NotNull
    private Long birthday;

    /**
     *
     */
    @NotNull
    @Size(max = 30)
    private String realName;

    /**
     *
     */
    @NotNull
    @Size(max = 30)
    private String englishName;

    /**
     * "M": Male
     * "F": Female
     */
    @NotNull
    private String gender;

    /**
     *
     */
    @NotNull
    @Size(max = 100)
    private String province;

    /**
     *
     */
    @NotNull
    @Size(max = 100)
    private String city;

    /**
     *
     */
    @NotNull
    @Size(max = 100)
    private String address;

    /**
     *
     */
    @NotNull
    @Size(max = 100)
    private String email;

}
