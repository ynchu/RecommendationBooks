package com.nchu.recom.service.impl;

import com.nchu.recom.domain.MajorCourse;
import com.nchu.recom.repository.MajorCourseRepository;
import com.nchu.recom.service.MajorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class MajorCourseServiceImpl implements MajorCourseService {

    private MajorCourseRepository mcRepo;

    public MajorCourseServiceImpl(MajorCourseRepository mcRepo) {
        this.mcRepo = mcRepo;
    }

    /**
     * 查找所有学生信息
     *
     * @return Collection<MajorCourse>
     */
    @Override
    public Collection<MajorCourse> getAllMajorCourse() {
        return mcRepo.findAll();
    }

    /**
     * 查询指定专业的所有信息
     *
     * @param majorId 专业Id
     * @return Collection<MajorCourse>
     */
    @Override
    public Collection<MajorCourse> getMajorCourseByMajorId(int majorId) {
        return mcRepo.findByMajor_id(majorId);
    }

    /**
     * 添加新的专业课程
     *
     * @param majorCourse 专业课程实体
     * @return boolean
     */
    @Override
    public boolean insertMajorCourse(MajorCourse majorCourse) {
        return mcRepo.insertMajorCourse(majorCourse.getMajor_id(), majorCourse.getCourse_id()) > 0;
    }

    /**
     * 删除某专业的指定课程
     *
     * @param majorCourse 专业课程实体
     * @return boolean
     */
    @Override
    public boolean deleteMajorCourse(MajorCourse majorCourse) {
        return mcRepo.deleteByMajor_idAndCourse_id(majorCourse.getMajor_id(), majorCourse.getCourse_id()) > 0;
    }
}
