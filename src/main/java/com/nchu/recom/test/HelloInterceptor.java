package com.nchu.recom.test;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class HelloInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("HelloInterceptor no = " + request.getParameter("no"));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        @SuppressWarnings("unchecked")
        List<Student> list = (List<Student>) modelAndView.getModel().get("list");
        if (list != null) {
            for (Student student : list) {
                System.out.println(student.getNo() + ", " + student.getName() + ", " + student.getAge());
            }
        }
    }

}
