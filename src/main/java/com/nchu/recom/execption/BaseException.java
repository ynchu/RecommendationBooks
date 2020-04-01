package com.nchu.recom.execption;

/**
 * 所需处理的异常基类类
 *
 * @author Administrator
 */
public abstract class BaseException extends Exception {
    /**
     * 获取错误码
     *
     * @return String
     */
    public abstract String getCode();

    /**
     * 获取错误信息
     *
     * @return String
     */
    @Override
    public abstract String getMessage();
}
