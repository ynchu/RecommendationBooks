package com.nchu.recom.repository;

import com.nchu.recom.domain.School;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface SchoolRepository extends CrudRepository<School, Integer> {

    /**
     * 根据名称来模糊匹配结果集
     * @param name 匹配名称
     * @return Collection<School>
     */
    @Query("select * from school where name like :condition")
    Collection<School> findByName(@Param("condition") String name);

    /**
     * 更细指定id的学校信息
     * @param name 更新后学校名称
     * @param address 更新后学校地址
     * @param tel 更新后学校电话
     * @param info 更新后学校详细
     * @param id 指定更新的学校id
     * @return boolean
     */
    @Modifying
    @Query("update school set name=:name, address=:address,tel=:tel,info=:info where id=:id")
    boolean updateSchool(@Param("name") String name,
                         @Param("address") String address,
                         @Param("tel") String tel,
                         @Param("info") String info,
                         @Param("id") int id);
}
