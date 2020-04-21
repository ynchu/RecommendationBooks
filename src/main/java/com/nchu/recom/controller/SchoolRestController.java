package com.nchu.recom.controller;

import com.nchu.recom.domain.School;
import com.nchu.recom.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/schools")
public class SchoolRestController {

    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<School>> schools(String name){
        Collection<School> schools;
        if (name == null) {
            schools = schoolService.getAllSchools();
        } else {
            schools = schoolService.findSchoolByName(name);
        }
        return new ResponseEntity<Collection<School>>(schools, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<School> addSchool(@RequestBody School school){
        schoolService.addSchool(school);
        return new ResponseEntity<School>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public ResponseEntity<School> delSchool(@RequestParam int id){
        schoolService.delSchool(id);
        return new ResponseEntity<School>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = "application/json")
    public ResponseEntity<School> updateSchool(@RequestBody School school){
        schoolService.updateSchool(school);
        return new ResponseEntity<School>(HttpStatus.OK);
    }

}
