package com.nchu.recom.execption;

/**
 * 所需处理的异常基类类
 *
 * @author Administrator
 */
public class BaseException extends Exception {
    /**
     * 错误码
     */
    protected int code;

    /**
     * 错误信息
     */
    protected String message;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
