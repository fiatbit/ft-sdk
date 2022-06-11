package com.ft.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiPage {

    /**
     * default: 1
     */
    private Integer pageNum;

    /**
     * default: 10
     */
    private Integer pageSize;

    /**
     *
     */
    private Long total;

    /**
     *
     */
    private Integer pages;

    /**
     *
     */
    private Integer nextPage;

    /**
     *
     */
    private Integer prePage;

}