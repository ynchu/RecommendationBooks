package com.nchu.recom.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class BroadcastLinkIdClass implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, name = "user_id")
    private int userId;

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
