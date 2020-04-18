package com.nchu.recom.service;

import com.nchu.recom.domain.Book;

import java.util.Collection;

public interface BookService {
    /**
     * 查找所有书籍
     *
     * @return Collection<Book>
     */
    Collection<Book> getAllBooks();

    /**
     * 根据书籍名称查找书籍
     *
     * @param name 书籍名称
     * @return Collection<Book>
     */
    Collection<Book> findByName(String name);

    /**
     * 修改书籍信息（id不变）
     *
     * @param book Book实体
     * @return Boolean
     */
    Boolean updateBook(Book book);

    // TODO 其他操作
}
