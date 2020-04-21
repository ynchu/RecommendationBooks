package com.nchu.recom.controller;

import com.nchu.recom.domain.BroadcastLink;
import com.nchu.recom.service.BroadcastLinkService;
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
@RequestMapping(value = "/api/v1/broadcastLink")
public class BroadcastLinkRestController {
    @Autowired
    private BroadcastLinkService broadcastLinkService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<BroadcastLink>> getAllBroadcastLinks(String userId) {
        Collection<BroadcastLink> broadcastLinks;
        if (userId == null) {
            System.out.println("查询所有通知连接");
            broadcastLinks = broadcastLinkService.getAllBroadcastLink();
            System.out.println(broadcastLinks == null);
        } else {
            System.out.println("根据用户id查询通知连接");
            broadcastLinks = broadcastLinkService.findByUserId(Integer.parseInt(userId));
        }
        return new ResponseEntity<Collection<BroadcastLink>>(broadcastLinks, HttpStatus.OK);
    }

//    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
//    public Boolean insertBroadcastLink(@Valid @RequestBody BroadcastLink broadcastLink) {
//        System.out.println("添加通知连接");
//        return broadcastLinkService.insertBroadcastLink(broadcastLink);
//    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
//    public Boolean deleteBroadcastLink(@Valid @RequestBody BroadcastLink broadcastLink) {
//        System.out.println("删除通知连接");
//        return broadcastLinkService.deleteBroadcastLink(broadcastLink);
//    }
}
