package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel("专业和包含的课程信息类")
@Entity
@Table(name = "major_course")
@IdClass(MajorCourseIdClass.class)
public class MajorCourse {

    @ApiModelProperty("专业编号")
    @Id
    @Column(name = "major_id")
    private int major_id;

    @ApiModelProperty("课程编号")
    @Id
    @Column(name = "major_id")
    private int course_id;

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}
