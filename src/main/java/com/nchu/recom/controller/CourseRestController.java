package com.nchu.recom.controller;

import com.nchu.recom.domain.Course;
import com.nchu.recom.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/v1/courses")
public class CourseRestController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<Course>> courses(String name){
        Collection<Course> courses;
        if (name == null){
            courses = courseService.getAllCourse();
        } else {
            courses = courseService.findCourseByName(name);
        }
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public ResponseEntity<Course> deleteCourse(@RequestParam int id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = "application/json")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}