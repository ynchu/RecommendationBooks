package com.nchu.recom.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "用户实体类")
public class User {
    @ApiModelProperty(notes = "用户编号")
    String userId;

    @ApiModelProperty(notes = "用户昵称")
    String nickName;

    @ApiModelProperty(notes = "用户密码")
    String pwd;

    @ApiModelProperty(notes = "用户性别")
    String sex;

    @ApiModelProperty(notes = "用户邮箱")
    String email;

    @ApiModelProperty(notes = "用户电话")
    String tel;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
