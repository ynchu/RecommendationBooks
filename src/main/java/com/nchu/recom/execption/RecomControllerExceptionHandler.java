package com.nchu.recom.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@ControllerAdvice
public class RecomControllerExceptionHandler {
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> handleStudentNotFound(BaseException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", e.getCode());
        map.put("message", e.getMessage());
        return map;
    }
}
