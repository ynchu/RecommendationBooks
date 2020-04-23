package com.nchu.recom.service;

import com.nchu.recom.domain.MajorCourse;

import java.util.Collection;

public interface MajorCourseService {

    /**
     * 查找所有专业课程信息
     *
     * @return Collection<MajorCourse>
     */
    Collection<MajorCourse> getAllMajorCourse();

    /**
     * 查询某专业下所有课程
     *
     * @param majorId 专业Id
     * @return Collection<MajorCourse>
     */
    Collection<MajorCourse> getMajorCourseByMajorId(int majorId);

    /**
     * 对某专业插入新的课程
     *
     * @param majorCourse 专业课程实体
     * @return boolean
     */
    boolean insertMajorCourse(MajorCourse majorCourse);

    /**
     * 删除某专业的指定课程
     *
     * @param majorCourse 专业课程实体
     * @return boolean
     */
    boolean deleteMajorCourse(MajorCourse majorCourse);

}
