package com.nchu.recom.service;

import com.nchu.recom.domain.VioDic;

import java.util.Collection;

public interface VioDicService {
    /**
     * 查询所有违规词
     *
     * @return Collection<VioDic>
     */
    Collection<VioDic> findAllVioDics();

    /**
     * 根据关键字查询违规词
     *
     * @param keyword 关键字
     * @return Collection<VioDic>
     */
    Collection<VioDic> findByKeyword(String keyword);

    /**
     * 添加违规词
     *
     * @param vioDic 违规词
     * @return Boolean
     */
    Boolean insertVioDic(VioDic vioDic);

    /**
     * 修改违规词
     *
     * @param oldVioDic 原来的违规词
     * @param newVioDic 新的违规词
     * @return Boolean
     */
    Boolean updateVioDic(VioDic oldVioDic, VioDic newVioDic);
}
