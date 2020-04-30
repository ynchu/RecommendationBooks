package com.nchu.recom.service;

import com.nchu.recom.domain.School;

import java.util.Collection;

public interface SchoolService {

    /**
     * 获取全部学校的信息
     *
     * @return Collection<School>
     */
    public Collection<School> getAllSchools();

    /**
     * 获取指定name的模糊匹配学校
     *
     * @param name 模糊匹配模式串
     * @return Collection<School>
     */
    public Collection<School> findSchoolByName(String name);

    /**
     * 获取指定id的学校
     *
     * @param id 学校id
     * @return Collection<School>
     */
    public Collection<School> findSchoolById(int id);

    /**
     * 添加新的学校实体
     *
     * @param school 学校实体
     * @return School
     */
    public School addSchool(School school);

    /**
     * 删除指定id的学校实体
     *
     * @param id 指定的id
     */
    public void delSchool(int id);

    /**
     * 更新指定的学校信息，指定的id在school实体中
     *
     * @param school 要更新的学校信息
     */
    public void updateSchool(School school);
}
