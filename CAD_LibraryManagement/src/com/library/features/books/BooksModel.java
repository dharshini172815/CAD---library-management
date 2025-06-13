package com.library.features.books;

import java.util.List;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.Book;

class BooksModel extends BaseModel {
	private final BooksView view;
	
	public BooksModel(BooksView booksview) {
		view = booksview;
	}
	
	void viewAllBooks() {
		List<Book>  books = LibraryDb.getInstance().getAllBooks();
		view.displayBooks(books);
	}

	
}
