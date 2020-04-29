package com.nchu.recom.repository;

import com.nchu.recom.domain.Major;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MajorRepository extends CrudRepository<Major, Integer> {

    /**
     *根据名称模糊搜索结果集合
     * @param name 匹配名称
     * @return Collection<Major>
     */
    @Query("select * from major where name like :name")
    Collection<Major> findByName(@Param("name") String name);

    /**
     * 更新指定id的专业信息
     * @param name 更新后专业名称
     * @param info 更新后专业详细
     * @param id 选定的id
     * @return boolean
     */
    @Modifying
    @Query("update major set name=:name,info=:info where id=:id")
    boolean updateMajor(@Param("name") String name,
                        @Param("info") String info,
                        @Param("id") int id);
}
