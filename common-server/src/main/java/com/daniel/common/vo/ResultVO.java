package com.daniel.common.vo;

import lombok.Data;

/**
 * Daniel on 2018/7/19.
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String message;
    private T data;
}
