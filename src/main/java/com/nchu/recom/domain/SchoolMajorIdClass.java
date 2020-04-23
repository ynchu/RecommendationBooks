package com.nchu.recom.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SchoolMajorIdClass implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, name = "school_id")
    private int school_id;

    @Id
    @Column(nullable = false, name = "major_id")
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
