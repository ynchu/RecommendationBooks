package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@ApiModel(description = "课程实体类")
@Component
@Table("course")
public class Course extends BaseNamed {

    @ApiModelProperty(notes = "课程信息")
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
