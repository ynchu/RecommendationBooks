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
    Optional<User> findById(String id);


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
     * @return User
     */
    Boolean addUser(User user);
}
