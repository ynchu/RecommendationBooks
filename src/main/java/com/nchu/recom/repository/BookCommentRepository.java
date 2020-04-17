package com.nchu.recom.repository;

import com.nchu.recom.domain.BookComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCommentRepository extends CrudRepository<BookComment, Integer> {

    // TODO
}
