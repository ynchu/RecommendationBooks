package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@ApiModel(description = "评论实体类")
@Component
@Table(value = "book_comment")
public class BookComment {
    @ApiModelProperty(notes = "评论编号")
    @Id
    @Column(value = "comment_id")
    private int commentId;

    @ApiModelProperty(notes = "图书编号")
    @Column(value = "book_id")
    private int bookId;

    @ApiModelProperty(notes = "用户编号")
    @Column(value = "user_id")
    private int userId;

    @ApiModelProperty(notes = "评论内容")
    @Column(value = "comment_content")
    private String commentContent;

    @ApiModelProperty(notes = "评论时间")
    @Column(value = "comment_date")
    private Timestamp commentDate;

    @ApiModelProperty(notes = "评论状态")
    @Column(value = "status")
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
