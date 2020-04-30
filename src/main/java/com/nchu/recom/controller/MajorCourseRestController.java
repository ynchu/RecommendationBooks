package com.nchu.recom.controller;

import com.nchu.recom.domain.Course;
import com.nchu.recom.domain.Major;
import com.nchu.recom.domain.MajorCourse;
import com.nchu.recom.domain.SchoolMajor;
import com.nchu.recom.service.CourseService;
import com.nchu.recom.service.MajorCourseService;
import com.nchu.recom.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/majorCourses")
public class MajorCourseRestController {

    private MajorCourseService mcService;
    private MajorService mService;
    private CourseService cService;

    public MajorCourseRestController(MajorCourseService mcService, MajorService mService, CourseService cService) {
        this.mcService = mcService;
        this.mService = mService;
        this.cService = cService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Major>> getAll(String name) {
        Collection<Major> majors;
        if (name == null) {
            System.out.println("find All courses in major");
            majors = mService.getAllMajors();
        } else {
            System.out.println("find course in major name: " + name);
            majors = mService.findMajorByName(name);
        }

        Map<Integer, Course> courseMap = new HashMap<>();
        Collection<Course> courses = cService.getAllCourse();
        for (Course course : courses) {
            courseMap.put(course.getId(), course);
        }

        for (Major major : majors) {
            Collection<MajorCourse> majorCourses = major.getMajorCourses();
            Collection<Course> co = new ArrayList<>();
            for (MajorCourse mc : majorCourses) {
                co.add(courseMap.get(mc.getCourse_id()));
            }
            major.setCourses(co);
        }

        if (majors.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(majors, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Major>> getMajorCourseById(@PathVariable int id) {
        Collection<Major> majors;
        majors = mService.findById(id);

        Map<Integer, Course> courseMap = new HashMap<>();
        Collection<Course> courses = cService.getAllCourse();
        for (Course course : courses) {
            courseMap.put(course.getId(), course);
        }

        for (Major major : majors) {
            Collection<MajorCourse> majorCourses = major.getMajorCourses();
            Collection<Course> co = new ArrayList<>();
            for (MajorCourse mc : majorCourses) {
                co.add(courseMap.get(mc.getCourse_id()));
            }
            major.setCourses(co);
        }

        return new ResponseEntity<>(majors, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insertMajorCourse(@RequestBody MajorCourse majorCourse) {
        System.out.println("insert course in major " + majorCourse.getMajor_id());
        return mcService.insertMajorCourse(majorCourse);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json")
    public Boolean deleteMajorCourse(MajorCourse majorCourse) {
        System.out.println("delete course " + majorCourse.getCourse_id() + " form major " + majorCourse.getMajor_id());
        return mcService.deleteMajorCourse(majorCourse);
    }
}
