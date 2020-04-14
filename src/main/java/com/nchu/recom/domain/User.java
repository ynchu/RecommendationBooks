package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@ApiModel(description = "用户实体类")
@Component
@Table(value = "user")
public class User {
    @ApiModelProperty(notes = "用户编号")
    @Id
    @Column(value = "id")
    private int id;

    @ApiModelProperty(notes = "用户昵称")
    @Column(value = "name")
    private String name;

    @ApiModelProperty(notes = "用户密码")
    @Column(value = "pwd")
    private String pwd;

    @ApiModelProperty(notes = "用户性别")
    @Column(value = "sex")
    private String sex;

    @ApiModelProperty(notes = "用户邮箱")
    @Column(value = "email")
    private String email;

    @ApiModelProperty(notes = "用户电话")
    @Column(value = "tel")
    private String tel;

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
