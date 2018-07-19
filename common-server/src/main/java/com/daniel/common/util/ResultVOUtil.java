package com.daniel.common.util;

import com.daniel.common.constant.CodeConstant;
import com.daniel.common.constant.MessageConstant;
import com.daniel.common.vo.ResultVO;

/**
 * Daniel on 2018/7/19.
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(CodeConstant.CODE_SUCCESS);
        resultVO.setMessage(MessageConstant.MESSAGE_SUCCESS);
        resultVO.setData(object);
        return resultVO;
    }
}