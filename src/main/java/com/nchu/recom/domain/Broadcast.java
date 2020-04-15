package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author Administrator
 */
@ApiModel(description = "广播通知实体类")
@Component
@Table(value = "broadcast")
public class Broadcast {
    @ApiModelProperty(notes = "广播通知编号")
    @Id
    @Column(value = "id")
    private int id;

    @ApiModelProperty(notes = "用户编号")
    @Column(value = "user_id")
    private int userId;

    @ApiModelProperty(notes = "广播通知内容")
    @Column(value = "content")
    private String content;

    @ApiModelProperty(notes = "发送通知时间")
    @Column(value = "time")
    private Timestamp time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
