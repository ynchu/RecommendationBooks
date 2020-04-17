package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@ApiModel(description = "评论实体类")
@Entity
@Table(name = "book_comment")
public class BookComment {
    @ApiModelProperty(notes = "评论编号")
    @Id
    @Column(nullable = false, name = "user_id")
    private int commentId;

    @ApiModelProperty(notes = "图书编号")
    @Column(name = "book_id")
    private int bookId;

    @ApiModelProperty(notes = "用户编号")
    @Column(name = "user_id")
    private String userId;

    @ApiModelProperty(notes = "评论内容")
    @Column(name = "comment_content")
    private String commentContent;

    @ApiModelProperty(notes = "评论时间")
    @Column(name = "comment_date")
    private Timestamp commentDate;

    @ApiModelProperty(notes = "评论状态")
    @Column(name = "status")
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
