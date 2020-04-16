package com.nchu.recom.service.impl;

import com.nchu.recom.domain.User;
import com.nchu.recom.repository.UserRepository;
import com.nchu.recom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 查询所有通知
     *
     * @return Collection<Broadcast>
     */
    @Override
    public Collection<User> getAllUsers() {
        return (Collection<User>) userRepository.findAll();
    }

    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    /**
     * 根据昵称查找通知
     *
     * @param name 用户昵称
     * @return Broadcast
     */
    @Override
    public Collection<User> findByName(String name) {
        return userRepository.findByName("%" + name + "%");
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return Boolean
     */
    @Override
    public Boolean insertUser(User user) {
        return userRepository.insertUser(user.getName(),
                user.getPwd(), user.getSex(), user.getEmail(), user.getTel());
    }

    /**
     * 修改用户
     *
     * @param user 用户
     * @return Boolean
     */
    @Override
    public Boolean updateUser(User user) {
        return userRepository.updateUser(user.getId(), user.getName(), user.getPwd(), user.getSex(),
                user.getEmail(), user.getTel());
    }

    /**
     * 根据用户id删除用户
     *
     * @param id 用户id
     * @return Boolean
     */
    @Override
    public Boolean deleteUserById(int id) {
        return userRepository.deleteUserById(id);
    }
}
