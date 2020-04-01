package com.nchu.recom.controller;

import com.nchu.recom.bean.TestUserFactory;
import com.nchu.recom.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class RecomRestController {
    @Autowired
    private TestUserFactory userFactory;

    @ApiOperation("Find a user by id...")
    @GetMapping("/users/{id}")
    public User students(@ApiParam("User Id") @PathVariable String id) throws Exception {
        return userFactory.findById(id);
    }
}
