package com.nchu.recom.controller;

import com.nchu.recom.domain.VioDic;
import com.nchu.recom.domain.VioDicMerge;
import com.nchu.recom.service.VioDicService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insertVioDic(@Valid @RequestBody VioDic vioDic) {
        System.out.println("添加违规词");
        return vioDicService.insertVioDic(vioDic);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean updateVioDic(@Valid @RequestBody VioDicMerge vioDicMerge) {
        System.out.println("修改违规词");
        System.out.println(vioDicMerge.getOldVioDic() + " - " + vioDicMerge.getNewVioDic());
        return vioDicService.updateVioDic(vioDicMerge.getOldVioDic(), vioDicMerge.getNewVioDic());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
    public Boolean deleteVioDic(@Valid @RequestBody VioDic vioDic) {
        System.out.println("删除违规词");
        return vioDicService.deleteVioDic(vioDic);
    }
}
