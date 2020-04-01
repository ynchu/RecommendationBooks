package com.nchu.recom.execption;

/**
 * 违规词未找到异常类
 *
 * @author Administrator
 */
public class VioDicNotFoundException extends BaseException {
    @Override
    public String getCode() {
        return "201";
    }

    @Override
    public String getMessage() {
        return "违规词未找到";
    }
}
