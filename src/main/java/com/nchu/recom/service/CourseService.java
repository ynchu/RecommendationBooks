package com.nchu.recom.service;


import com.nchu.recom.domain.Course;

import java.util.Collection;

public interface CourseService {
    /**
     * 查找所有课程
     * @return Collection<Course>
     */
    public Collection<Course> getAllCourse();

    /**
     * 查找指定模糊名称的课程
     * @param name 模糊匹配模式串
     * @return Collection<Course>
     */
    public Collection<Course> findCourseByName(String name);

    /**
     * 添加新的课程
     * @param course 新的课程实体
     * @return Course
     */
    public Course addCourse(Course course);

    /**
     * 删除指定id的课程对象
     * @param id 指定id
     */
    public void deleteCourse(int id);

    /**
     * 更新指定课程，指定的id包含在course对象里
     * @param course 更新的course内容
     */
    public void updateCourse(Course course);
}
