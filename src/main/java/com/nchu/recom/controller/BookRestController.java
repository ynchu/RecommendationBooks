package com.nchu.recom.controller;

import com.nchu.recom.domain.Book;
import com.nchu.recom.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.stream.Collectors;

@Api("This is a RESTful Controller Demo")
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/books")
public class BookRestController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Book>> getAllBooks(String name) {
        Collection<Book> books;
        if (name == null) {
            System.out.println("查询所有书籍");
            books = bookService.getAllBooks();
        } else {
            System.out.println("根据名称查询书籍");
            books = bookService.findByName(name);
        }
        return new ResponseEntity<Collection<Book>>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "filter", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Book>> getBooksFilter(String name) {
        Collection<Book> books;
        if (name == null) {
            System.out.println("查询所有书籍");
            books = bookService.getAllBooks();
        } else {
            System.out.println("根据名称查询书籍");
            books = bookService.findByName(name);
        }
        Collection<Book> booksFilter;
        booksFilter = books.stream().filter(book -> book.getStatus() == 0).collect(Collectors.toList());
        return new ResponseEntity<Collection<Book>>(booksFilter, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Book> bookAdd(@RequestBody Book book) {
        System.out.println("新书添加，书名:" + book.getName());
        bookService.addBook(book);
        return new ResponseEntity<Book>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<Collection<Book>> bookDel(@RequestParam("id") int id) {
        System.out.println("删除书，书号" + id);
        bookService.delBook(id);
        return new ResponseEntity<Collection<Book>>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
    public Boolean updateBook(@Valid @RequestBody Book book) {
        System.out.println("修改书籍，书号" + book.getId());
        return bookService.updateBook(book);
    }

    // TODO 其他操作
}
