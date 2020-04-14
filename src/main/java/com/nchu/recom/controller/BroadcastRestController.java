//package com.nchu.recom.controller;
//
//import com.nchu.recom.domain.Broadcast;
//import com.nchu.recom.service.BroadcastService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.*;
//
//@RestController
//@RequestMapping(value = "/api/v1/broadcasts")
//@CrossOrigin
//public class BroadcastRestController {
//    @Autowired
//    private BroadcastService broadcastService;
//
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity<Collection<Broadcast>> getAllBroadcasts(String id) {
//        Collection<Broadcast> broadcasts;
//        if (id == null) {
//            broadcasts = broadcastService.getAllBroadcasts();
//        } else {
//            broadcasts = new ArrayList<Broadcast>(Collections.singletonList(broadcastService.findById(id)));
//        }
//        return new ResponseEntity<Collection<Broadcast>>(broadcasts, HttpStatus.OK);
//    }
//
////    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
////    public ResponseEntity<Collection<Broadcast>> createNewBroadcast() {
////        Collection<Broadcast> broadcasts;
////        if (id == null) {
////            broadcasts = broadcastService.getAllBroadcasts();
////        } else {
////            broadcasts = new ArrayList<Broadcast>(Collections.singletonList(broadcastService.findById(id)));
////        }
////        return new ResponseEntity<Collection<Broadcast>>(broadcasts, HttpStatus.OK);
////    }
//
//
//}
