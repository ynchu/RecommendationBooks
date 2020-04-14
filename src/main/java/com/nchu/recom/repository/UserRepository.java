package com.nchu.recom.repository;

import com.nchu.recom.domain.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    /**
     * 根据昵称查找用户
     *
     * @param name 用户昵称
     * @return Collection<User>
     */
    @Query("SELECT * FROM user WHERE name like :name;")
    Collection<User> findByName(@Param("name") String name);

    /**
     * 添加用户
     *
     * @param name  用户昵称
     * @param pwd   密码
     * @param sex   性别
     * @param email 邮箱
     * @param tel   电话
     * @return Boolean
     */
    @Modifying
    @Query("INSERT INTO user(name, pwd, sex, email, tel) VALUES (:name, :pwd, :sex, :email, :tel);")
    Boolean insertUser(@Param("name") String name,
                       @Param("pwd") String pwd,
                       @Param("sex") String sex,
                       @Param("email") String email,
                       @Param("tel") String tel);
}
