package com.nchu.recom.controller;

import com.nchu.recom.domain.VioDic;
import com.nchu.recom.service.VioDicService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/vioDics")
public class VioDicRestController {
    @Autowired
    private VioDicService vioDicService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<VioDic>> getAllVioDics(String keyword) {
        Collection<VioDic> vioDics;
        if (keyword == null) {
            System.out.println("查询所有违规词");
            vioDics = vioDicService.findAllVioDics();
        } else {
            System.out.println("根据关键字查询违规词");
            System.out.println("keyword = " + keyword);
            vioDics = vioDicService.findByKeyword(keyword);
        }
        return new ResponseEntity<Collection<VioDic>>(vioDics, HttpStatus.OK);
    }

//    TODO 其他操作一系列
}
