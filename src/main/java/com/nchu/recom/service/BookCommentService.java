package com.nchu.recom.service;

import com.nchu.recom.domain.BookComment;

import java.util.Collection;

public interface BookCommentService {
    /**
     * 查找所有的书籍评论
     *
     * @return Iterable<BookComment>
     */
    Collection<BookComment> findAll();

    /**
     * 根据用户id查找自己的书籍评论
     *
     * @param userId 用户id
     * @return Collection<BookComment>
     */
    Collection<BookComment> findByUserId(int userId);

    /**
     * 修改评论
     *
     * @param bookComment 评论实体类
     * @return Boolean
     */
    Boolean updateBookComment(BookComment bookComment);

    /**
     * 通过评论id删除评论
     *
     * @param bookComment BookComment
     * @return Boolean
     */
    Boolean deleteBookCommentByCommentId(BookComment bookComment);

    // TODO
}
