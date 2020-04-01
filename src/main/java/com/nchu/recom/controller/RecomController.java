package com.nchu.recom.controller;

import com.nchu.recom.bean.TestUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 */
@Controller
public class RecomController {
    @Autowired
    private TestUserFactory userFactory;

    @GetMapping("/")
    private String getHome(Model model) {
        model.addAttribute("list", userFactory.createUsers());
        return "index";
    }
}
