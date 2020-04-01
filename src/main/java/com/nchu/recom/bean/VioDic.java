package com.nchu.recom.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@ApiModel(description = "违规词实体类")
public class VioDic {
    @ApiModelProperty(notes = "违规词")
    private String vicWord;

    public String getVicWord() {
        return vicWord;
    }

    public void setVicWord(String vicWord) {
        this.vicWord = vicWord;
    }
}
