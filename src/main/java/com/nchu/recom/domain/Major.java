package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.util.Collection;

@ApiModel(description = "专业实体类")
@Component
@Table("major")
public class Major extends BaseNamed {
    @ApiModelProperty(notes = "专业信息")
    private String info;

    @MappedCollection(idColumn = "major_id", keyColumn = "course_id")
    private Collection<MajorCourse> majorCourses;

    @Transient
    private Collection<Course> courses;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Collection<MajorCourse> getMajorCourses() {
        return majorCourses;
    }

    public void setMajorCourses(Collection<MajorCourse> majorCourses) {
        this.majorCourses = majorCourses;
    }

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Course> courses) {
        this.courses = courses;
    }
}
