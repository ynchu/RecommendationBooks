package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "图书实体类")
public class Book {
    @ApiModelProperty(notes = "图书编号")
    @Id
    @Column(value = "id")
    private int id;

    @ApiModelProperty(notes = "图书名称")
    @Column(value = "name")
    private String name;

    @ApiModelProperty(notes = "图书出版社")
    @Column(value = "publish")
    private String publish;

    @ApiModelProperty(notes = "图书isbn")
    @Column(value = "isbn")
    private String isbn;

    @ApiModelProperty(notes = "图书作者")
    @Column(value = "writer")
    private String writer;

    @ApiModelProperty(notes = "图书本地链接")
    @Column(value = "local_url")
    private String localUrl;

    @ApiModelProperty(notes = "图书价格")
    @Column(value = "price")
    private float price;

    @ApiModelProperty(notes = "图书类型")
    @Column(value = "type")
    private String type;

    @ApiModelProperty(notes = "图书上传人")
    @Column(value = "upper")
    private String upper;

    @ApiModelProperty(notes = "图书类型")
    @Column(value = "viewed")
    private int viewed;

    @ApiModelProperty(notes = "图书封面")
    @Column(value = "cover")
    private String cover = "images/default.png";

    @ApiModelProperty(notes = "图书状态")
    @Column(value = "status")
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getLocalUrl() {
        return localUrl;
    }

    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpper() {
        return upper;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
