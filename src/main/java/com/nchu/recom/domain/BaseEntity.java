package com.nchu.recom.domain;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

public class BaseEntity {

    @ApiModelProperty(notes = "编号")
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
