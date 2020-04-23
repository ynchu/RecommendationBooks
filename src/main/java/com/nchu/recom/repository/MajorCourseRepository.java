package com.nchu.recom.repository;

import com.nchu.recom.domain.MajorCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface MajorCourseRepository extends JpaRepository<MajorCourse, Long> {

    /**
     * 查找所有专业包含课程相关信息
     *
     * @return Iterable<MajorCourse>
     */
    @Query(value = "select * from major_course", nativeQuery = true)
    @Override
    List<MajorCourse> findAll();

    /**
     * 查询指定id专业的课程
     *
     * @param majorId 专业Id
     * @return Collection<MajorCourse>
     */
    @Query(value = "select * from major_course where major_id=:mid", nativeQuery = true)
    Collection<MajorCourse> findByMajor_id(@Param("mid") int majorId);

    /**
     * 插入新的专业课程信息
     *
     * @param majorId  专业Id
     * @param courseId 课程Id
     * @return int
     */
    @Modifying
    @Query(value = "insert into major_course(major_id,course_id) values (:mid,:cid)", nativeQuery = true)
    int insertMajorCourse(@Param("mid") int majorId,
                          @Param("cid") int courseId);

    /**
     * 删除指定专业的指定课程
     *
     * @param majorId  专业id
     * @param courseId 课程id
     * @return int
     */
    @Modifying
    @Query(value = "delete from major_course where major_id=:mid and course_id=:cid", nativeQuery = true)
    int deleteByMajor_idAndCourse_id(@Param("mid") int majorId,
                                     @Param("cid") int courseId);
}
