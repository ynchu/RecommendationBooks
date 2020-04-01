package com.nchu.recom.execption;

/**
 * 用户未找到异常类
 *
 * @author Administrator
 */
public class UserNotFoundException extends BaseException {
    @Override
    public String getCode() {
        return "101";
    }

    @Override
    public String getMessage() {
        return "用户未找到";
    }
}
