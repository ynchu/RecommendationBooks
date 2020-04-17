package com.nchu.recom.service.impl;

import com.nchu.recom.repository.BookCommentRepository;
import com.nchu.recom.service.BookCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCommentServiceImpl implements BookCommentService {
    private BookCommentRepository bookCommentRepository;

    @Autowired
    public BookCommentServiceImpl(BookCommentRepository bookCommentRepository) {
        this.bookCommentRepository = bookCommentRepository;
    }


}
