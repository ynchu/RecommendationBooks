package com.nchu.recom.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MajorCourseIdClass implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false,name = "major_id")
    private int major_id;

    @Id
    @Column(nullable = false,name = "course_id")
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
