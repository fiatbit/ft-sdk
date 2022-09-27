package com.ft.domain.remittance.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 */
@Getter
@Setter
public class GetOrderListRequest {

    /**
     *
     */
    private Integer status;

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
