package com.nchu.recom.service.impl;

import com.nchu.recom.domain.BookComment;
import com.nchu.recom.repository.BookCommentRepository;
import com.nchu.recom.service.BookCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookCommentServiceImpl implements BookCommentService {
    private BookCommentRepository bookCommentRepository;

    @Autowired
    public BookCommentServiceImpl(BookCommentRepository bookCommentRepository) {
        this.bookCommentRepository = bookCommentRepository;
    }


    /**
     * 查找所有的书籍评论
     *
     * @return Iterable<BookComment>
     */
    @Override
    public Collection<BookComment> findAll() {
        return bookCommentRepository.findAll();
    }

    /**
     * 根据用户id查找自己的书籍评论
     *
     * @param userId 用户id
     * @return Collection<BookComment>
     */
    @Override
    public Collection<BookComment> findByUserId(int userId) {
        return bookCommentRepository.findByUserId(userId);
    }

    /**
     * 修改评论
     *
     * @param bookComment 评论实体类
     * @return Boolean
     */
    @Override
    public Boolean updateBookComment(BookComment bookComment) {
        return bookCommentRepository.updateBookComment(bookComment.getCommentId(), bookComment.getBookId(),
                bookComment.getUserId(), bookComment.getCommentContent(), bookComment.getCommentDate(), bookComment.getStatus());
    }
}
