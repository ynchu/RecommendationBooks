package com.nchu.recom.service;


import com.nchu.recom.domain.Major;

import java.util.Collection;

public interface MajorService {
    /**
     * 获取全部专业信息
     * @return Collection<Major>
     */
    public Collection<Major> getAllMajors();

    /**
     * 获取指定模糊名称的专业信息
     * @param name 模糊匹配模式串
     * @return Collection<Major>
     */
    public Collection<Major> findMajorByName(String name);

    /**
     * 添加新的专业
     * @param major 新的专业实体
     * @return Major
     */
    public Major addMajor(Major major);

    /**
     * 删除指定id的专业
     * @param id 指定的id
     */
    public void deleteMajor(int id);

    /**
     * 更新指定的专业信息，指定的id在major实体中
     * @param major 更新的major信息
     */
    public void updateMajor(Major major);

}
