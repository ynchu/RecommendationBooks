package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

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
}
