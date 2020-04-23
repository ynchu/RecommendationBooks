package com.nchu.recom.service;

import com.nchu.recom.domain.School;
import com.nchu.recom.domain.SchoolMajor;

import java.util.Collection;

public interface SchoolMajorService {

    /**
     * 查找所有学校包含专业信息
     * @return Collection<SchoolMajor>
     */
    Collection<SchoolMajor> getAllSchoolMajor();

    /**
     * 查找指定id的学校
     * @param schoolId 学校Id
     * @return Collection<SchoolMajor>
     */
    Collection<SchoolMajor> getSchoolMajorBySchoolId(int schoolId);

    /**
     * 插入新的学校包含专业信息
     * @param schoolMajor 学校专业实体
     * @return boolean
     */
    boolean insertSchoolMajor(SchoolMajor schoolMajor);

    /**
     * 删除指定学校包含专业信息
     * @param schoolMajor 学校专业实体
     * @return boolean
     */
    boolean deleteSchoolMajor(SchoolMajor schoolMajor);

}
