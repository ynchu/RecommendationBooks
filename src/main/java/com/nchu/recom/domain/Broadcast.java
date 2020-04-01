package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "广播通知实体类")
public class Broadcast {
    @ApiModelProperty(notes = "用户编号")
    private String userId;

    @ApiModelProperty(notes = "广播通知编号")
    private String broadcastId;

    @ApiModelProperty(notes = "广播通知内容")
    private String content;

    @ApiModelProperty(notes = "发松通知时间")
    private Timestamp time;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
