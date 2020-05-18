package com.nchu.recom.controller;

import com.nchu.recom.domain.Broadcast;
import com.nchu.recom.domain.BroadcastLink;
import com.nchu.recom.domain.User;
import com.nchu.recom.service.BroadcastLinkService;
import com.nchu.recom.service.BroadcastService;
import com.nchu.recom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/broadcasts")
public class BroadcastRestController {
    @Autowired
    private BroadcastService broadcastService;

    @Autowired
    private BroadcastLinkService broadcastLinkService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Broadcast>> getAllBroadcasts(String id) {
        List<Broadcast> broadcasts;
//        if (id == null || "".equals(id)) {
//            System.out.println("查询全部通知");
//            System.out.println("id = " + id);
//            broadcasts = (List<Broadcast>) broadcastService.getAllBroadcasts();
//        } else {
//            try {
//                System.out.println("根据id查询通知");
//                System.out.println("id = " + id);
//                broadcasts = new ArrayList<Broadcast>(Collections.singletonList(broadcastService.findById(id)));
//            } catch (Exception e) {
//                broadcasts = (List<Broadcast>) broadcastService.getAllBroadcasts();
//            }
//        }

        broadcasts = (List<Broadcast>) broadcastService.getAllBroadcasts();
        if (id != null && !"".equals(id)) {
            System.out.println("id = " + id);
            broadcasts = broadcasts.stream().filter(broadcast -> broadcast.getContent().contains(id)).collect(Collectors.toList());
        }

        broadcasts.sort(new Comparator<Broadcast>() {
            @Override
            public int compare(Broadcast o1, Broadcast o2) {
                return o2.getTime().compareTo(o1.getTime());
            }
        });
        return new ResponseEntity<Collection<Broadcast>>(broadcasts, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insertBroadcast(@Valid @RequestBody Broadcast broadcast) {
        System.out.println("添加通知");
        broadcast.setId(UUID.randomUUID().toString());
        broadcast.setTime(new Timestamp(System.currentTimeMillis()));
        Boolean aBoolean = broadcastService.insertBroadcast(broadcast);
        if (!aBoolean) {
            return false;
        }
        // 插入完成之后便要发送给全部用户
        Collection<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            BroadcastLink broadcastLink = new BroadcastLink();
            broadcastLink.setBroadcastId(broadcast.getId());
            broadcastLink.setUserId(user.getId());
            Boolean aBoolean1 = broadcastLinkService.insertBroadcastLink(broadcastLink);
            if (!aBoolean1) {
                return false;
            }
        }
        return true;

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
