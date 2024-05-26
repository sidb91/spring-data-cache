package com.opolo.springdatacache.service;

import com.opolo.springdatacache.entity.Book;

public interface BookService  {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}
