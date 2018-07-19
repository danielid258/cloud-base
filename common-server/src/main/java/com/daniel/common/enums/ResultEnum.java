package com.daniel.common.enums;

import com.daniel.common.constant.CodeConstant;
import com.daniel.common.constant.MessageConstant;

/**
 * Daniel on 2018/7/19.
 */
public enum ResultEnum {
    PRODUCT_NOT_EXIST(CodeConstant.CODE_PRODUCT_NOT_EXIST, MessageConstant.MESSAGE_PRODUCT_NOT_EXIST),
    PRODUCT_STOCK_ERROR(CodeConstant.CODE_PRODUCT_STOCK_ERROR, MessageConstant.MESSAGE_PRODUCT_STOCK_ERROR);

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
