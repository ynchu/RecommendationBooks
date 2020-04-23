package com.nchu.recom.controller;


import com.nchu.recom.domain.SchoolMajor;
import com.nchu.recom.service.SchoolMajorService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Api("This is REST for Majors in School")
@CrossOrigin
@RestController
@RequestMapping("/api/v1/schoolMajors")
public class SchoolMajorRestController {

    private SchoolMajorService smService;

    public SchoolMajorRestController(SchoolMajorService smService) {
        this.smService = smService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<SchoolMajor>> getAll(String schoolId) {
        Collection<SchoolMajor> schoolMajors;
        if (schoolId == null) {
            System.out.println("find All Majors in School");
            schoolMajors = smService.getAllSchoolMajor();
        } else {
            System.out.println("find majors in school Id: " + schoolId);
            schoolMajors = smService.getSchoolMajorBySchoolId(Integer.parseInt(schoolId));
        }
        return new ResponseEntity<>(schoolMajors, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST,produces = "application/json")
    public Boolean insertSchoolMajor(@RequestBody SchoolMajor schoolMajor){
        System.out.println("insert major in School " + schoolMajor.getSchool_id());
        return smService.insertSchoolMajor(schoolMajor);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public Boolean deleteSchoolMajor(SchoolMajor schoolMajor){
        System.out.println("delete major" + schoolMajor.getMajor_id() + "form school " + schoolMajor.getSchool_id());
        return smService.deleteSchoolMajor(schoolMajor);
    }
}
