package com.nchu.recom.repository;

import com.nchu.recom.domain.School;
import com.nchu.recom.domain.SchoolMajor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface SchoolMajorRepository extends JpaRepository<SchoolMajor,Long> {

    /**
     * 查询所有学校和专业的关系
     * @return Iterable<SchoolMajor>
     */
    @Query(value = "select * from school_major", nativeQuery = true)
    @Override
    List<SchoolMajor> findAll();


    /**
     * 查询指定学校的专业信息
     * @param school_id 学校ID
     * @return Collection<SchoolMajor>
     */
    @Query(value = "select * from school_major where school_id=:schoolId",nativeQuery = true)
    Collection<SchoolMajor> findBySchool_id(@Param("schoolId") int school_id);

    /**
     * 指定学校插入指定专业
     * @param schoolId 学校Id
     * @param majorId 专业Id
     * @return int
     */
    @Modifying
    @Query(value = "insert into school_major(school_id, major_id) values (:schoolId,:majorId)",nativeQuery = true)
    int insertSchoolMajor(@Param("schoolId") int schoolId,@Param("majorId") int majorId);

    /**
     * 删除指定学校的某指定专业
     * @param schoolId 学校Id
     * @param majorId 专业Id
     * @return int
     */
    @Modifying
    @Query(value = "delete from school_major where school_id=:sid and major_id=:mid",nativeQuery = true)
    int deleteByMajor_idAndMajor_id(@Param("sid") int schoolId,@Param("mid") int majorId);

}
