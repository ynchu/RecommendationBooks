package com.nchu.recom.service.impl;

import com.nchu.recom.domain.Major;
import com.nchu.recom.repository.MajorRepository;
import com.nchu.recom.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MajorServiceImpl implements MajorService {

    private MajorRepository majorRepo;

    @Autowired
    public MajorServiceImpl(MajorRepository majorRepo) {
        this.majorRepo = majorRepo;
    }


    /**
     * 获取全部专业信息
     * @return Collection<Major>
     */
    @Override
    public Collection<Major> getAllMajors() {
        return (Collection<Major>) majorRepo.findAll();
    }

    /**
     * 获取指定模糊匹配name的专业信息
     * @param name 模糊匹配模式串
     * @return Collection<Major>
     */
    @Override
    public Collection<Major> findMajorByName(String name) {
        return (Collection<Major>) majorRepo.findByName("%" + name + "%");
    }

    /**
     * 添加新的专业信息
     * @param major 新的专业实体
     * @return Major
     */
    @Override
    public Major addMajor(Major major) {
        return majorRepo.save(major);
    }

    /**
     * 检查是否存在指定id的专业，存在则删除
     * @param id 指定的id
     */
    @Override
    public void deleteMajor(int id) {
        if (majorRepo.existsById(id)){
            majorRepo.deleteById(id);
        }
    }

    /**
     * 检查是否存在指定id的专业，存在则更新信息
     * @param major 更新的major信息
     */
    @Override
    public void updateMajor(Major major) {
        if (majorRepo.existsById(major.getId())){
            majorRepo.updateMajor(major.getName(),major.getInfo(),major.getId());
        }
    }
}
