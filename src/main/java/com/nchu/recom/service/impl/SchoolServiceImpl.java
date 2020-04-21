package com.nchu.recom.service.impl;

import com.nchu.recom.domain.School;
import com.nchu.recom.repository.SchoolRepository;
import com.nchu.recom.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schRepo;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schRepo) {
        this.schRepo = schRepo;
    }

    /**
     * 获取全部学校信息
     * @return Collection<School>
     */
    @Override
    public Collection<School> getAllSchools() {
        return (Collection<School>) schRepo.findAll();
    }

    /**
     * 获取模糊匹配name的学校信息
     * @param name 模糊匹配模式串
     * @return Collection<School>
     */
    @Override
    public Collection<School> findSchoolByName(String name) {
        return (Collection<School>) schRepo.findByName("%" + name + "%");
    }

    /**
     * 添加新的学校实体
     * @param school 学校实体
     * @return School
     */
    @Override
    public School addSchool(School school) {
        return schRepo.save(school);
    }

    /**
     * 删除指定id的学校实体
     * @param id 指定的id
     */
    @Override
    public void delSchool(int id) {
        if (schRepo.existsById(id)){
            schRepo.deleteById(id);
        }
    }

    /**
     * 更新学校信息，id指定包含在param中
     * @param school 要更新的学校信息
     */
    @Override
    public void updateSchool(School school) {
        if (schRepo.existsById(school.getId())){
            schRepo.updateSchool(school.getName(),school.getAddress(),
                    school.getTel(),school.getInfo(),school.getId());
        }
    }
}
