package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.util.Collection;

@ApiModel(description = "学校实体类")
@Component
@Table("school")
public class School extends BaseNamed {


    @ApiModelProperty(notes = "学校地址")
    private String address;
    @ApiModelProperty(notes = "学校电话")
    private String tel;
    @ApiModelProperty(notes = "学校信息")
    private String info;

    @MappedCollection(idColumn = "school_id",keyColumn = "major_id")
    private Collection<SchoolMajor> schoolMajors;

    @Transient
    private Collection<Major> majors;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Collection<SchoolMajor> getSchoolMajors() {
        return schoolMajors;
    }

    public void setSchoolMajors(Collection<SchoolMajor> schoolMajors) {
        this.schoolMajors = schoolMajors;
    }

    public Collection<Major> getMajors() {
        return majors;
    }

    public void setMajors(Collection<Major> majors) {
        this.majors = majors;
    }
}
