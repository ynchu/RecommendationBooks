package com.nchu.recom.repository;

import com.nchu.recom.domain.Course;
import com.nchu.recom.domain.Major;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

    /**
     * 根据名称来模糊匹配结果集
     * @param name 匹配名称
     * @return Collection<Course>
     */
    @Query("select * form course where name like :name")
    Collection<Course> findByName(@Param("name") String name);

    /**
     * 获取指定学校不包含的专业集合
     * @param MajorId 学校id
     * @return Collection<Major>
     */
    @Query("select * from course where id not in (select course_id from major_course where major_id=:Mid)")
    Collection<Course> findByIdNotInMajor(@Param("Mid") int MajorId);

    /**
     * 更新指定id的课程信息
     * @param name 更改后课程名称
     * @param info 更改后课程详细
     * @param id 选定的课程ID
     * @return boolean
     */
    @Modifying
    @Query("update course set name=:name,info=:info where id=:id")
    boolean updateCourse(@Param("name") String name,
                         @Param("info") String info,
                         @Param("id") int id);
}
