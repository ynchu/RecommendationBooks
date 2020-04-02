package com.nchu.recom.controller;

import com.nchu.recom.domain.*;
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

    @Autowired
    private BroadcastFactory broadcastFactory;

    @ApiOperation("查找所有用户")
    @GetMapping("/users")
    public List<User> getUsers() {
        return userFactory.getUsers();
    }

    @ApiOperation("根据ID直接查找用户")
    @GetMapping("/users/{id}")
    public User getUser(@ApiParam("User Id") @PathVariable String id) throws Exception {
        return userFactory.findById(id);
    }

    @ApiOperation("找到所有的违规词")
    @GetMapping("/badwords")
    public List<VioDic> getBadWords() {
        return vioDicFactory.getVioDics();
    }

    @ApiOperation("直接精确查找违规词")
    @GetMapping("/badwords/{keyword}")
    public VioDic getBadWordsByKeyWord(@ApiParam("关键字")
                                       @PathVariable String keyword)
            throws Exception {
        return vioDicFactory.findByKeyword(keyword);
    }

    @ApiOperation("找到所有的广播通知信息")
    @GetMapping("/broadcasts")
    public List<Broadcast> getBroadcasts() {
        return broadcastFactory.getBroadcasts();
    }

    @ApiOperation("直接精确查找违规词")
    @GetMapping("/broadcasts/{id}")
    public Broadcast getBroadcastByKeyWord(@ApiParam("广播通知id")
                                           @PathVariable String id)
            throws Exception {
        return broadcastFactory.findById(id);
    }
}
