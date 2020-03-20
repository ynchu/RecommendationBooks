package com.nchu.recom.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @Autowired
    private StudentFactory stFactory;

    @GetMapping("/")
    public String gethome(Model model) {
        System.out.println("This is a get request...");
        return "home";
    }

    @PostMapping("/")
    public String posthome(Model model, String no) {
        System.out.println("This is a post request...");
        System.out.println(no);
        model.addAttribute("list", stFactory.findBy(no));
        return "home";
    }

    @GetMapping("/login")
    public String login(int type, HttpSession session) {
        if (type == 1) {
            session.setAttribute("login", new Object());
        } else {
            session.removeAttribute("login");
        }
        return "home";
    }
}
