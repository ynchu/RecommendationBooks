package com.nchu.recom.service.impl;

import com.nchu.recom.domain.Course;
import com.nchu.recom.repository.CourseRepository;
import com.nchu.recom.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepo;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }


    /**
     * 获取全部的课程信息
     * @return Collection<Course>
     */
    @Override
    public Collection<Course> getAllCourse() {
        return (Collection<Course>) courseRepo.findAll();
    }

    /**
     * 获取指定模糊匹配name的课程信息
     * @param name 模糊匹配模式串
     * @return Collection<Course>
     */
    @Override
    public Collection<Course> findCourseByName(String name) {
        return (Collection<Course>) courseRepo.findByName("%" + name + "%");
    }

    @Override
    public Collection<Course> findByIdNotInMajor(int id) {
        return courseRepo.findByIdNotInMajor(id);
    }

    /**
     * 添加新的课程实体
     * @param course 新的课程实体
     * @return Course
     */
    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    /**
     * 存在则删除指定id的课程，
     * @param id 指定id
     */
    @Override
    public void deleteCourse(int id) {
        if (courseRepo.existsById(id)){
            courseRepo.deleteById(id);
        }
    }

    /**
     * 存在则更新指定id的course信息
     * @param course 更新的course内容
     */
    @Override
    public void updateCourse(Course course) {
        if (courseRepo.existsById(course.getId())){
            courseRepo.updateCourse(course.getName(),course.getInfo(),course.getId());
        }
    }
}
