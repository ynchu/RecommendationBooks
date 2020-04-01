package com.nchu.recom.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "图书实体类")
public class Book {
    @ApiModelProperty(notes = "图书编号")
    private int bookId;

    @ApiModelProperty(notes = "图书名称")
    private String bookName;

    @ApiModelProperty(notes = "封面路径")
    private String cover;

    @ApiModelProperty(notes = "图书类型")
    private String type;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
