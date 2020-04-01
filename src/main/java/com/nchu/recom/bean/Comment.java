package com.nchu.recom.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "评论实体类")
public class Comment {
    @ApiModelProperty(notes = "评论编号")
    private int commentId;

    @ApiModelProperty(notes = "图书编号")
    private int bookId;

    @ApiModelProperty(notes = "用户编号")
    private String userId;

    @ApiModelProperty(notes = "评论内容")
    private String commentContent;

    @ApiModelProperty(notes = "评论时间")
    private Timestamp commentDate;

    @ApiModelProperty(notes = "评论状态")
    private int status;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
