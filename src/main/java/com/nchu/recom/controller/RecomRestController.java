package com.nchu.recom.controller;

import com.nchu.recom.domain.UserFactory;
import com.nchu.recom.domain.User;
import com.nchu.recom.domain.VioDic;
import com.nchu.recom.domain.VioDicFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class RecomRestController {
    @Autowired
    private UserFactory userFactory;

    @Autowired
    private VioDicFactory vioDicFactory;

    @ApiOperation("查找所有用户")
    @GetMapping("/users")
    public List<User> getUsers() throws Exception {
        return userFactory.getUsers();
    }

    @ApiOperation("根据ID直接查找用户")
    @GetMapping("/users/{id}")
    public User getUser(@ApiParam("User Id") @PathVariable String id) throws Exception {
        return userFactory.findById(id);
    }

    @ApiOperation("找到所有的违规词")
    @GetMapping("/badwords")
    public List<VioDic> getBadWords() throws Exception {
        return vioDicFactory.getVioDics();
    }

    @ApiOperation("直接精确查找违规词")
    @GetMapping("/badwords/{keyword}")
    public VioDic getBadWordsByKeyWord(@ApiParam("关键字")
                                       @PathVariable String keyword)
            throws Exception {
        return vioDicFactory.findByKeyword(keyword);
    }
}
