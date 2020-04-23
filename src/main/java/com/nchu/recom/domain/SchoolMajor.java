package com.nchu.recom.domain;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel(description = "学校与专业关系类")
@Entity
@Table(name = "school_major")
@IdClass(value = SchoolMajorIdClass.class)
public class SchoolMajor {

    @ApiModelProperty(notes = "学校编号")
    @Id
    @Column(name = "school_id")
    private int school_id;

    @ApiModelProperty(notes = "专业编号")
    @Id
    @Column(name = "major_id")
    private int major_id;

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }
}
