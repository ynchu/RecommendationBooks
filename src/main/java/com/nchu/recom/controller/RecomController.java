package com.nchu.recom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 */
@Controller
@CrossOrigin
public class RecomController {
    @GetMapping("/login.html")
    private String login(Model model) {
        return "login";
    }

    @GetMapping("")
    private String getHome(Model model) {
        System.out.println("首页");
        return "index";
    }

    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public String settings() {
        System.out.println("设置");
        return "settings";
    }

    @GetMapping("/tongzhi")
    private String getBroadcast(Model model) {
        System.out.println("通知");
        return "tongzhi";
    }

    @RequestMapping(value = "/xinjiantongzhi", method = RequestMethod.GET)
    public String newBroadcast() {
        System.out.println("新建通知");
        return "xinjiantongzhi";
    }

    @RequestMapping(value = "/shangchuanbadword", method = RequestMethod.GET)
    public String updateBadWord() {
        System.out.println("上传违规词");
        return "shangchuanbadword";
    }

    @RequestMapping(value = "/badwordmanage", method = RequestMethod.GET)
    public String badWordManage() {
        System.out.println("违规词管理");
        return "badwordmanage";
    }

    @RequestMapping(value = "/commentsmanage", method = RequestMethod.GET)
    public String commentsManage() {
        System.out.println("评论管理");
        return "commentsmanage";
    }

    @RequestMapping(value = "/uploadbookmanage", method = RequestMethod.GET)
    public String uploadBookManage() {
        System.out.println("审核上传书籍管理");
        return "uploadbookmanage";
    }

    @RequestMapping(value = "/badwordupload", method = RequestMethod.GET)
    public String badWordUpload() {
        System.out.println("违规词上传");
        return "badwordupload";
    }

    @RequestMapping("/books")
    public String books(){
        return "books/bookList";
    }

    @RequestMapping("/books/add")
    public String bookAdd(){
        return "books/bookAdd";
    }
}
