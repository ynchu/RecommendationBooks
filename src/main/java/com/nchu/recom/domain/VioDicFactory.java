package com.nchu.recom.domain;

import com.nchu.recom.execption.VioDicNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class VioDicFactory {
    /**
     * 生成用于测试的违规词信息
     *
     * @return List<VioDic> 违规词列表
     */
    public List<VioDic> getVioDics() {
        List<VioDic> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            VioDic vioDic = new VioDic();
            vioDic.setVicWord("违规词" + String.format("%02d", i + 1));
            list.add(vioDic);
        }
        return list;
    }

    /**
     * 根据关键字查找违规词
     *
     * @param keyword 关键字
     * @return VioDic
     * @throws Exception 违规词未找到
     */
    public VioDic findByKeyword(String keyword) throws Exception {
        List<VioDic> list = getVioDics();
        VioDic vioDic = list.stream().filter(e -> e.getVicWord().equals(keyword))
                .findFirst().orElse(null);
        if (vioDic == null) {
            throw new VioDicNotFoundException();
        }
        return vioDic;
    }
}
