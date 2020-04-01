package com.nchu.recom.domain;

import com.nchu.recom.execption.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
@Component
public class UserFactory {
    /**
     * 生成用于测试的用户信息
     *
     * @return List<User> 用户信息列表
     */
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setUserId("172011" + String.format("%02d", i + 1));
            user.setNickName("昵称" + String.format("%02d", i + 1));
            user.setPwd("123456" + String.format("%02d", i + 1));
            int num = (int) (Math.random() * 10);
            String sex = (num > 5) ? "男" : "女";
            user.setSex(sex);
            user.setEmail("172011" + String.format("%02d", i + 1) + "@qq.com");
            user.setTel("111111111" + String.format("%02d", i + 1));
            list.add(user);
        }
        return list;
    }

    /**
     * 根据id精确查找用户
     *
     * @param id 用户id
     * @return User 用户
     * @throws Exception 用户找不到异常
     */
    public User findById(String id) throws Exception {
        List<User> list = getUsers();
        User user = list.stream().filter(e -> e.getUserId().equals(id))
                .findFirst().orElse(null);
        if (user == null) {
            throw new UserNotFoundException();
        }
        return user;
    }

    /**
     * 根据id模糊查找用户
     *
     * @param id 用户id
     * @return List<User> 用户信息列表
     */
    public List<User> find(String id) {
        List<User> list = getUsers();
        return list.stream().filter(e -> e.getUserId().contains(id))
                .collect(Collectors.toList());
    }
}
