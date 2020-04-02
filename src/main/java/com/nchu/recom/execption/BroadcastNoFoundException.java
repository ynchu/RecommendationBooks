package com.nchu.recom.execption;

/**
 * @author Administrator
 */
public class BroadcastNoFoundException extends BaseException {
    /**
     * 获取错误码
     *
     * @return String
     */
    @Override
    public String getCode() {
        return "202";
    }

    /**
     * 获取错误信息
     *
     * @return String
     */
    @Override
    public String getMessage() {
        return "通知未找到";
    }
}
