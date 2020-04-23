package com.nchu.recom.service.impl;

import com.nchu.recom.domain.SchoolMajor;
import com.nchu.recom.repository.SchoolMajorRepository;
import com.nchu.recom.service.SchoolMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class SchoolMajorServiceImpl implements SchoolMajorService {

    private SchoolMajorRepository smRepo;

    public SchoolMajorServiceImpl(SchoolMajorRepository smRepo) {
        this.smRepo = smRepo;
    }

    /**
     * 查找所有学校专业信息
     * @return Collection<SchoolMajor>
     */
    @Override
    public Collection<SchoolMajor> getAllSchoolMajor() {
        return smRepo.findAll();
    }

    /**
     * 查找指定学校的专业信息
     * @param schoolId 学校Id
     * @return Collection<SchoolMajor>
     */
    @Override
    public Collection<SchoolMajor> getSchoolMajorBySchoolId(int schoolId) {
        return smRepo.findBySchool_id(schoolId);
    }

    /**
     * 插入新的学校包含专业信息
     * @param schoolMajor 学校专业实体
     * @return boolean
     */
    @Override
    public boolean insertSchoolMajor(SchoolMajor schoolMajor) {
        return smRepo.insertSchoolMajor(schoolMajor.getSchool_id(), schoolMajor.getMajor_id()) > 0;
    }

    /**
     * 删除指定学校的某专业
     * @param schoolMajor 学校专业实体
     * @return boolean
     */
    @Override
    public boolean deleteSchoolMajor(SchoolMajor schoolMajor) {
        return smRepo.deleteByMajor_idAndMajor_id(schoolMajor.getSchool_id(), schoolMajor.getMajor_id()) > 0;
    }
}
