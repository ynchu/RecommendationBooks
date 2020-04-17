package com.nchu.recom.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/bookComments")
public class BookCommentRestController {
    // TODO
}
