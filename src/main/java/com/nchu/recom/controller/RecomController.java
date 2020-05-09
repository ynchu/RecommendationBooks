package com.nchu.recom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "setting/broadcast/tongzhi";
    }

    @RequestMapping(value = "/xinjiantongzhi", method = RequestMethod.GET)
    public String newBroadcast() {
        System.out.println("新建通知");
        return "setting/broadcast/xinjiantongzhi";
    }

//    @RequestMapping(value = "/shangchuanbadword", method = RequestMethod.GET)
//    public String updateBadWord() {
//        System.out.println("上传违规词");
//        return "shangchuanbadword";
//    }

    @RequestMapping(value = "/badwordmanage", method = RequestMethod.GET)
    public String badWordManage() {
        System.out.println("违规词管理");
        return "setting/badword/badwordmanage";
    }

    @RequestMapping(value = "/badwordupload", method = RequestMethod.GET)
    public String badWordUpload() {
        System.out.println("违规词上传");
        return "setting/badword/badwordupload";
    }

    @RequestMapping(value = "/commentsmanage", method = RequestMethod.GET)
    public String commentsManage() {
        System.out.println("评论管理");
        return "setting/bookComment/commentManage";
    }

//    @RequestMapping(value = "/commentsmanage", method = RequestMethod.GET)
//    public String commentsManage() {
//        System.out.println("评论管理");
//        return "commentsmanage";
//    }

    @RequestMapping(value = "/uploadBookManage", method = RequestMethod.GET)
    public String uploadBookManage() {
        System.out.println("审核上传书籍管理");
        return "setting/checkBooks/checkBooks";
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String uploadBookManageCheck() {
        System.out.println("审核上传书籍管理");
        return "setting/checkBooks/checkItem";
    }


    @RequestMapping("/books")
    public String books() {
        return "setting/books/bookList";
    }

    @RequestMapping("/books/add")
    public String bookAdd() {
        return "setting/books/bookAdd";
    }

    @RequestMapping("/users")
    public String users() {
        return "setting/users/userList";
    }

    @RequestMapping("/users/add")
    public String usersAdd() {
        return "setting/users/userAdd";
    }

    @RequestMapping("/schools")
    public String schools() {
        return "setting/school/schoolList";
    }

    @RequestMapping("/schools/{id}")
    public String schoolsById(@PathVariable int id) {
        return "setting/school/schoolDetail";
    }

    @RequestMapping("/majors/{id}")
    public String majorById(@PathVariable int id) {
        return "setting/major/majorDetail";
    }

    @RequestMapping("/schools/add")
    public String schoolsAdd() {
        return "setting/school/schoolAdd";
    }

    @RequestMapping("/majors")
    public String majors() {
        return "setting/major/majorList";
    }

    @RequestMapping("/majors/add")
    public String majorsAdd() {
        return "setting/major/majorAdd";
    }

    @RequestMapping("/courses")
    public String courses() {
        return "setting/courses/coursesList";
    }

    @RequestMapping("/courses/add")
    public String courseAdd() {
        return "setting/courses/coursesAdd";
    }
}
