package com.nchu.recom.controller;

import com.nchu.recom.domain.BookComment;
import com.nchu.recom.service.BookCommentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/bookComments")
public class BookCommentRestController {
    @Autowired
    private BookCommentService bookCommentService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<BookComment>> getAllBookComments(String userId) {
        System.out.println("查询评论");
        Collection<BookComment> bookComments;
        if (userId == null) {
            bookComments = (Collection<BookComment>) bookCommentService.findAll();
        } else {
            try {
                int intId = Integer.parseInt(userId);
                bookComments = new ArrayList<BookComment>(bookCommentService.findByUserId(intId));
            } catch (Exception e) {
                bookComments = (Collection<BookComment>) bookCommentService.findAll();
            }
        }
        return new ResponseEntity<Collection<BookComment>>(bookComments, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean updateBookComment(@Valid @RequestBody BookComment bookComment) {
        System.out.println("修改评论");
        // TODO 之后去掉测试插入的时间
        bookComment.setCommentDate(new Timestamp(System.currentTimeMillis()));
        return bookCommentService.updateBookComment(bookComment);
    }

    // TODO
}
