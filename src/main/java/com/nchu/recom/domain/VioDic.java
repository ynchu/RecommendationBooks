package com.nchu.recom.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@ApiModel(description = "违规词实体类")
@Component
@Table(value = "vio_dic")
public class VioDic {
    @ApiModelProperty(notes = "违规词")
    @Id
    @Column(value = "vio_word")
    private String vicWord;

    public String getVicWord() {
        return vicWord;
    }

    public void setVicWord(String vicWord) {
        this.vicWord = vicWord;
    }
}
