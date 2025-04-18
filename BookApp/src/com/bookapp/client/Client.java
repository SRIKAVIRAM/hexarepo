package com.bookapp.client;

import com.bookapp.dao.IBookDao;
import com.bookapp.dao.BookDaoImpl;
import com.bookapp.model.Book;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        IBookDao dao = new BookDaoImpl();

        // Add
        Book book1 = new Book(101, "Atomic Habits", "James Clear", "Self-help", 499.0f);
        dao.addBook(book1);

        // Get by ID
        Book fetched = dao.getBookById(101);
        System.out.println("Fetched Book: " + fetched);

        // Update
        book1.setPrice(599.0f);
        dao.updateBook(book1);

        // Get All
        List<Book> allBooks = dao.getAllBooks();
        System.out.println("All Books:");
        allBooks.forEach(System.out::println);

        // Delete
        dao.deleteBook(101);
        System.out.println("Deleted book with ID 101");
    }
}
