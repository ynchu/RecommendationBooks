package com.nchu.recom.repository;

import com.nchu.recom.domain.Book;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    /**
     * 根据名称搜索书籍
     *
     * @param name 书籍名称
     * @return Collection<User>
     */
    @Query("SELECT * FROM book WHERE name LIKE :name;")
    Collection<Book> findByName(@Param("name") String name);

    // TODO 其他操作
}
