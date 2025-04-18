package com.bookapp.dao;

import com.bookapp.model.Book;
import java.util.List;

public interface IBookDao {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int id);
    Book getBookById(int id);
    List<Book> getAllBooks();
}
