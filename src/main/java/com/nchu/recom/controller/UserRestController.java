package com.nchu.recom.controller;

import com.nchu.recom.domain.User;
import com.nchu.recom.execption.UserAddException;
import com.nchu.recom.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/users")
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<User>> getAllUsers(String name) {
        Collection<User> users;
        if (name == null) {
            System.out.println("查询所有用户");
            users = userService.getAllUsers();
        } else {
            System.out.println("根据昵称查询用户");
            users = userService.findByName(name);
        }
        return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insertUser(@Valid @RequestBody User user, BindingResult result) throws UserAddException {
        if (result.hasErrors()) {
            System.out.println("添加用户失败");
            throw new UserAddException(401, "用户存储失败");
        }
        System.out.println("添加用户");
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
    public Boolean updateUser(@Valid @RequestBody User user) {
        System.out.println("修改用户");
        return userService.updateUser(user);
    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json")
    public Boolean deleteUserById(@Valid @RequestParam int id) {
        System.out.println("id = " + id);
        System.out.println("根据用户id删除用户");
        return userService.deleteUserById(id);
    }
}
