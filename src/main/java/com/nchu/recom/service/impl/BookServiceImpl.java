package com.nchu.recom.service.impl;

import com.nchu.recom.domain.Book;
import com.nchu.recom.repository.BookRepository;
import com.nchu.recom.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * 查找所有书籍
     *
     * @return Collection<Book>
     */
    @Override
    public Collection<Book> getAllBooks() {
        return (Collection<Book>) bookRepository.findAll();
    }

    /**
     * 根据书籍名称查找书籍
     *
     * @param name 书籍名称
     * @return Collection<Book>
     */
    @Override
    public Collection<Book> findByName(String name) {
        return bookRepository.findByName("%" + name + "%");
    }
}
