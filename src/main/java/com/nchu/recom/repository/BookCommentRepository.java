package com.nchu.recom.repository;

import com.nchu.recom.domain.BookComment;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Collection;

@Repository
public interface BookCommentRepository extends CrudRepository<BookComment, Integer> {
    /**
     * 查找所有的书籍评论
     *
     * @return Iterable<BookComment>
     */
    @Query("SELECT * FROM book_comment;")
    @Override
    Collection<BookComment> findAll();

    /**
     * 根据用户id查找自己的书籍评论
     *
     * @param userId 用户id
     * @return Collection<BookComment>
     */
    @Query("SELECT * FROM book_comment WHERE user_id = :userId;")
    Collection<BookComment> findByUserId(@Param("userId") int userId);

    /**
     * 修改评论
     *
     * @param commentId      评论id
     * @param bookId         书籍id
     * @param userId         用户id
     * @param commentContent 评论详情
     * @param commentDate    评论时间
     * @return Boolean
     */
    @Modifying
    @Query("UPDATE book_comment SET book_id = :bookId, user_id = :userId, comment_content = :commentContent, comment_date = :commentDate, status = :status WHERE comment_id = :commentId;")
    Boolean updateBookComment(@Param("commentId") int commentId,
                              @Param("bookId") int bookId,
                              @Param("userId") int userId,
                              @Param("commentContent") String commentContent,
                              @Param("commentDate") Timestamp commentDate,
                              @Param("status") int status);

    /**
     * 通过评论Id删除评论
     *
     * @return Boolean
     */
    @Modifying
    @Query("DELETE FROM book_comment WHERE comment_id = :commentId;")
    Boolean deleteBookCommentByCommentId(@Param("commentId") int commentId);

    // TODO
}
