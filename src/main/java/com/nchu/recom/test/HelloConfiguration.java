package com.nchu.recom.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HelloConfiguration implements WebMvcConfigurer {
    @Autowired
    private HelloInterceptor interceptor;

    @Autowired
    private HelloImgInterceptor imginterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/");

        registry.addInterceptor(imginterceptor).addPathPatterns("/**.png");
        registry.addInterceptor(imginterceptor).addPathPatterns("/**.jpg");
    }

}
