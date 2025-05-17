package com.library.features.books;

public class BooksView {
	private final BooksModel model;
	
	public BooksView() {
		model = new BooksModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Books view - " +model);
	}
}
