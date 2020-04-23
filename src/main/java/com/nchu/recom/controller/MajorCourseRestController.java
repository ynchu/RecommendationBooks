package com.nchu.recom.controller;

import com.nchu.recom.domain.Major;
import com.nchu.recom.domain.MajorCourse;
import com.nchu.recom.domain.SchoolMajor;
import com.nchu.recom.service.MajorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/majorCourses")
public class MajorCourseRestController {

    private MajorCourseService mcService;

    public MajorCourseRestController(MajorCourseService mcService) {
        this.mcService = mcService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<MajorCourse>> getAll(String majorId) {
        Collection<MajorCourse> majorCourses;
        if (majorId == null) {
            System.out.println("find All courses in major");
            majorCourses = mcService.getAllMajorCourse();
        } else {
            System.out.println("find course in major Id: " + majorId);
            majorCourses = mcService.getMajorCourseByMajorId(Integer.parseInt(majorId));
        }
        return new ResponseEntity<>(majorCourses, HttpStatus.OK);
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
