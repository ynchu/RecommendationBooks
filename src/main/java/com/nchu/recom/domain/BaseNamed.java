package com.nchu.recom.domain;

import io.swagger.annotations.ApiModelProperty;

public class BaseNamed extends BaseEntity {
    @ApiModelProperty(notes = "名称")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
