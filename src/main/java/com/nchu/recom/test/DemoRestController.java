package com.nchu.recom.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("This is a RESTful Controller Demo")
@RestController
@RequestMapping("/api/v1")
public class DemoRestController {
    @Autowired
    private StudentFactory sf;

    @ApiOperation("Show a simple message ...")
    @GetMapping("/msg")
    public String msg() {
        return "Hello, RESTful ...";
    }

    @ApiOperation("Show all students ...")
    @GetMapping("/students")
    public List<Student> students() {
        return sf.getStudent();
    }

    @ApiOperation("Find a student given no ...")
    @GetMapping("/students/{no}")
    public Student students(@ApiParam("Student no") @PathVariable String no) throws StudentNotFoundException {
        return sf.findByNo(no);
    }
}
