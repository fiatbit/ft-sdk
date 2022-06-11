package com.ft.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GetCardTransactionListRequest {

    /**
     *
     */
    @NotNull
    private String cardNumber;

    /**
     *
     */
    @Min(1)
    private Integer pageNum;

    /**
     *
     */
    @Min(10)
    @Max(100)
    private Integer pageSize;

    /**
     *
     */
    private Long startTime;

    /**
     *
     */
    private Long endTime;

}
