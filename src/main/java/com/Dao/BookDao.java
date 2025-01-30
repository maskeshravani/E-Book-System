package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Book;
import com.util.util;

public class BookDao {

    // Save Book using HQL
    public void saveBook(Book book) {
        Session ss = util.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.persist(book); // Using Hibernate's persist for saving
        tr.commit();
        ss.close();
    }

    // Get Book by ID using HQL
    public Book getBookById(int id) {
        Session ss = util.getSessionFactory().openSession();
        Query<Book> query = ss.createQuery("FROM Book WHERE id = :id", Book.class);
        query.setParameter("id", id);
        Book b = query.uniqueResult();
        ss.close();
        return b;
    }

    // Get All Books using HQL
    public List<Book> getAllBooks() {
        Session ss = util.getSessionFactory().openSession();
        Query<Book> query = ss.createQuery("FROM Book", Book.class);
        List<Book> books = query.list();
        ss.close();
        return books;
    }

    // Update Book using HQL
    public void updateBook(Book book) {
        Session ss = util.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        Query query = ss.createQuery("UPDATE Book SET title = :title, author = :author, price = :price WHERE id = :id");
        query.setParameter("title", book.getTitle());
        query.setParameter("author", book.getAuthor());
        query.setParameter("price", book.getPrice());
        query.setParameter("id", book.getId());
        query.executeUpdate();
        tr.commit();
        ss.close();
    }

    // Delete Book using HQL
    public void deleteBook(int id) {
        Session ss = util.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        Query query = ss.createQuery("DELETE FROM Book WHERE id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
        tr.commit();
        ss.close();
    }
}
