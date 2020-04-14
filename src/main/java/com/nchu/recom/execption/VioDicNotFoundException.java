package com.nchu.recom.execption;

/**
 * 违规词未找到异常类
 *
 * @author Administrator
 */
public class VioDicNotFoundException extends BaseException {
    public VioDicNotFoundException(int code, String message) {
        super(code, message);
    }
}
