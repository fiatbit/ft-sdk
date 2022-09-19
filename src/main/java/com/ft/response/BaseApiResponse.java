package com.ft.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseApiResponse {

    /**
     *
     */
    private int code;

    /**
     *
     */
    private String message;

    /**
     *
     */
    private Object data;

}
