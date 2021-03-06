package com.nchu.recom.service.impl;

import com.nchu.recom.domain.VioDic;
import com.nchu.recom.repository.VioDicRepository;
import com.nchu.recom.service.VioDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VioDicServiceImpl implements VioDicService {
    private VioDicRepository vioDicRepository;

    @Autowired
    public VioDicServiceImpl(VioDicRepository vioDicRepository) {
        this.vioDicRepository = vioDicRepository;
    }

    /**
     * 查询所有违规词
     *
     * @return Collection<VioDic>
     */
    @Override
    public Collection<VioDic> findAllVioDics() {
        return (Collection<VioDic>) vioDicRepository.findAll();
    }

    /**
     * 根据关键字查询违规词
     *
     * @param keyword 关键字
     * @return Collection<VioDic>
     */
    @Override
    public Collection<VioDic> findByKeyword(String keyword) {
        return vioDicRepository.findByKeyword("%" + keyword + "%");
    }

    /**
     * 添加违规词
     *
     * @param vioDic 违规词
     * @return Boolean
     */
    @Override
    public Boolean insertVioDic(VioDic vioDic) {
        return vioDicRepository.insertVioDic(vioDic.getVicWord());
    }

    /**
     * 添加违规词
     *
     * @param vioDicList 违规词列表
     * @return Boolean
     */
    @Override
    public Boolean insertVioDicList(List<VioDic> vioDicList) {
        boolean isOK = false;
        for (VioDic vioDic : vioDicList) {
            isOK = vioDicRepository.insertVioDic(vioDic.getVicWord());
        }
        return isOK;
    }

    /**
     * 删除违规词
     *
     * @param vioDic 违规词实体类
     * @return Boolean
     */
    @Override
    public Boolean deleteVioDic(VioDic vioDic) {
        return vioDicRepository.deleteVioDic(vioDic.getVicWord());
    }

    /**
     * 修改违规词
     *
     * @param oldVioDic 原来的违规词
     * @param newVioDic 新的违规词
     * @return Boolean
     */
    @Override
    public Boolean updateVioDic(VioDic oldVioDic, VioDic newVioDic) {
        return vioDicRepository.updateVioDic(oldVioDic.getVicWord(), newVioDic.getVicWord());
    }
}
