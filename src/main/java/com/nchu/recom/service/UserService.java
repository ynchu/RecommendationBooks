package com.nchu.recom.service;

import com.nchu.recom.domain.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public interface UserService {
    /**
     * 查询所有通知
     *
     * @return Collection<Broadcast>
     */
    Collection<User> getAllUsers();

    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    Optional<User> findById(int id);


    /**
     * 根据昵称查找通知
     *
     * @param nickName 用户昵称
     * @return Broadcast
     */
    Collection<User> findByName(String nickName);

    /**
     * 添加用户
     *
     * @param user 用户
     * @return Boolean
     */
    Boolean insertUser(User user);

    /**
     * 修改用户
     *
     * @param user 用户
     * @return Boolean
     */
    Boolean updateUser(User user);

    /**
     * 根据用户id删除用户
     *
     * @param id 用户id
     * @return Boolean
     */
    Boolean deleteUserById(int id);
}
