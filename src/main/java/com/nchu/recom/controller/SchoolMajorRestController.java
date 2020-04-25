package com.nchu.recom.controller;


import com.nchu.recom.domain.Major;
import com.nchu.recom.domain.School;
import com.nchu.recom.domain.SchoolMajor;
import com.nchu.recom.service.MajorService;
import com.nchu.recom.service.SchoolMajorService;
import com.nchu.recom.service.SchoolService;
import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Api("This is REST for Majors in School")
@CrossOrigin
@RestController
@RequestMapping("/api/v1/schoolMajors")
public class SchoolMajorRestController {

    private SchoolMajorService smService;
    private final SchoolService sService;
    private final MajorService mService;

    public SchoolMajorRestController(SchoolMajorService smService, SchoolService sService, MajorService mService) {
        this.smService = smService;
        this.sService = sService;
        this.mService = mService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<School>> getAll(String name) {
//        Collection<SchoolMajor> schoolMajors;
        Collection<School> schools;
        if (name == null) {
            System.out.println("find All Majors in School");
//            schoolMajors = smService.getAllSchoolMajor();
            schools = sService.getAllSchools();
        } else {
//            schoolMajors = smService.getSchoolMajorBySchoolId(Integer.parseInt(schoolId));
            System.out.println("find majors in school name: " + name);
            schools = sService.findSchoolByName(name);
        }

        Map<Integer, Major> majorMap = new HashMap<>();
        Collection<Major> majors = mService.getAllMajors();
        for (Major major:majors){
            majorMap.put(major.getId(),major);
        }

        for (School school:schools){
            Collection<SchoolMajor> schoolMajors = school.getSchoolMajors();
            Collection<Major> ma = new ArrayList<>();
            for (SchoolMajor sm:schoolMajors){
                ma.add(majorMap.get(sm.getMajor_id()));
            }
            school.setMajors(ma);
        }

        if (schools.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(schools, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST,produces = "application/json")
    public Boolean insertSchoolMajor(@RequestBody SchoolMajor schoolMajor){
        System.out.println("insert major in School " + schoolMajor.getSchool_id());
        return smService.insertSchoolMajor(schoolMajor);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public Boolean deleteSchoolMajor(SchoolMajor schoolMajor){
        System.out.println("delete major" + schoolMajor.getMajor_id() + " form school " + schoolMajor.getSchool_id());
        return smService.deleteSchoolMajor(schoolMajor);
    }
}
