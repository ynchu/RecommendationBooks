package com.nchu.recom.execption;

/**
 * 用户未找到异常类
 *
 * @author Administrator
 */
public class UserNotFoundException extends BaseException {
    public UserNotFoundException(int code, String message) {
        super(code, message);
    }
}
