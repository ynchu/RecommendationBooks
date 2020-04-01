package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

/**
 * 用于连接广播通知与用户的类，实现发送通知的功能
 *
 * @author Administrator
 */
@Component
@ApiModel(description = "广播通知连接类")
public class BroadcastLink {
    @ApiModelProperty(notes = "用户编号")
    private String userId;

    @ApiModelProperty(notes = "广播通知编号")
    private String broadcastId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(String broadcastId) {
        this.broadcastId = broadcastId;
    }
}
