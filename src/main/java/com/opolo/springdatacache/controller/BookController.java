package com.opolo.springdatacache.controller;

import com.opolo.springdatacache.entity.Book;
import com.opolo.springdatacache.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book-service")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable long id){
        return bookService.getBook(id);
    }
    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable long id){
        return bookService.deleteBook(id);
    }
}
