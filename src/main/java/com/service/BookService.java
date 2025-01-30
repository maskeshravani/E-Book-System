package com.service;

import java.util.List;

import com.Dao.BookDao;
import com.entity.Book;

public class BookService {
	private final BookDao bookDao = new BookDao();

	public void addBook(Book book) {
		bookDao.saveBook(book);
	}

	public Book getBook(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

}
