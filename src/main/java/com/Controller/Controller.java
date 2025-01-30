package com.Controller;

import java.util.ArrayList;
import java.util.List;
import com.entity.Book;

public class Controller {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void createBook(String title, String author, double price) {
        books.add(new Book(nextId++, title, author, price));
    }

    public Book viewBook(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public List<Book> viewAllBooks() {
        return books;
    }

    public boolean editBook(int id, String title, String author, double price) {
        Book book = viewBook(id);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setPrice(price);
            return true;
        }
        return false;
    }

    public boolean deleteBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
}
