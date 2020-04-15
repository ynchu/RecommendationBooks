package com.nchu.recom.controller;

import com.nchu.recom.domain.Broadcast;
import com.nchu.recom.domain.Broadcast;
import com.nchu.recom.service.BroadcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/broadcasts")
public class BroadcastRestController {
    @Autowired
    private BroadcastService broadcastService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Broadcast>> getAllBroadcasts(String id) {
        System.out.println("查询通知");
        Collection<Broadcast> broadcasts;
        if (id == null) {
            broadcasts = broadcastService.getAllBroadcasts();
        } else {
            try {
                int intId = Integer.parseInt(id);
                broadcasts = new ArrayList<Broadcast>(Collections.singletonList(broadcastService.findById(intId)));
            } catch (Exception e) {
                broadcasts = broadcastService.getAllBroadcasts();
            }
        }
        return new ResponseEntity<Collection<Broadcast>>(broadcasts, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insertBroadcast(@Valid @RequestBody Broadcast broadcast) {
        System.out.println("添加通知");
        // TODO 之后去掉测试插入的时间
        broadcast.setTime(new Timestamp(System.currentTimeMillis()));
        return broadcastService.insertBroadcast(broadcast);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean updateBroadcast(@Valid @RequestBody Broadcast broadcast) {
        System.out.println("修改通知");
        // TODO 之后去掉测试插入的时间
        broadcast.setTime(new Timestamp(System.currentTimeMillis()));
        return broadcastService.updateBroadcast(broadcast);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
    public Boolean deleteBroadcast(@Valid @RequestBody Broadcast broadcast) {
        System.out.println("删除通知");
        return broadcastService.deleteBroadcast(broadcast);
    }
}
