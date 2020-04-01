package com.nchu.recom.bean;

import com.nchu.recom.execption.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class TestUserFactory {
    public List<User> createUsers() {
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

    public User findById(String id) throws Exception {
        List<User> list = createUsers();
        User student =
                list.stream().filter(e -> e.getUserId().equals(id))
                        .findFirst().orElse(null);
        if (student == null) {
            throw new UserNotFoundException();
        }
        return student;
    }

}
