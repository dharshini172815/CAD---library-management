package com.library.features.books;

public class BooksModel {
	private final BooksView view;
	
	public BooksModel(BooksView booksview) {
		view = booksview;
	}
	
	void init() {
		System.out.println("Books model - " +view);
	}
}
