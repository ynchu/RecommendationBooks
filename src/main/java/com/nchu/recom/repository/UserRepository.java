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

    /**
     * 修改用户信息
     *
     * @param id    用户id
     * @param name  用户名
     * @param pwd   用户密码
     * @param sex   用户性别
     * @param email 用户邮箱
     * @param tel   用户电话
     * @return Boolean
     */
    @Modifying
    @Query("UPDATE user SET name = :name, pwd = :pwd, sex = :sex, email = :email, tel = :tel WHERE id = :id;")
    Boolean updateUser(@Param("id") int id,
                       @Param("name") String name,
                       @Param("pwd") String pwd,
                       @Param("sex") String sex,
                       @Param("email") String email,
                       @Param("tel") String tel);

    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return Boolean
     */
    @Modifying
    @Query("DELETE FROM user WHERE id = :id;")
    Boolean deleteUserById(@Param("id") int id);

}
