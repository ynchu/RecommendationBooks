package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel(description = "广播通知连接类")
@Entity
@Table(name = "broad_link")
@IdClass(value = BroadcastLinkIdClass.class)
public class BroadcastLink {
    @ApiModelProperty(notes = "用户编号")
    @Id
    @Column(nullable = false, name = "user_id")
    private int userId;

    @ApiModelProperty(notes = "广播通知编号")
    @Id
    @Column(nullable = false, name = "broadcast_id")
    private String broadcastId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(String broadcastId) {
        this.broadcastId = broadcastId;
    }
}
