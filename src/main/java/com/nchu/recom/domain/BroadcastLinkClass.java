package com.nchu.recom.domain;

import javax.persistence.Column;
import java.io.Serializable;

public class BroadcastLinkClass implements Serializable {
    @Column(nullable = false, name = "user_id")
    private int userId;

    @Column(nullable = false, name = "broadcast_id")
    private int broadcastId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(int broadcastId) {
        this.broadcastId = broadcastId;
    }
}
