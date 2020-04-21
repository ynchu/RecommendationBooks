package com.nchu.recom.controller;

import com.nchu.recom.domain.Major;
import com.nchu.recom.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/majors")
public class MajorRestController {

    @Autowired
    MajorService majorService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<Major>> majors(String name){
        Collection<Major> majors;
        if (name == null){
            majors = majorService.getAllMajors();
        } else {
            majors = majorService.findMajorByName(name);
        }
        return new ResponseEntity<>(majors, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<Major> addMajor(@RequestBody Major major){
        majorService.addMajor(major);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public ResponseEntity<Major> delMajor(@RequestParam int id){
        majorService.deleteMajor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = "application/json")
    public ResponseEntity<Major> updateMajor(@RequestBody Major major){
        majorService.updateMajor(major);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
