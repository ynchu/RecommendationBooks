package com.nchu.recom.execption;

/**
 * @author Administrator
 */
public class UserNotFoundException extends Exception {
    public int getErrCode() {
        return 101;
    }

    @Override
    public String getMessage() {
        return "User Not Found";
    }
}
