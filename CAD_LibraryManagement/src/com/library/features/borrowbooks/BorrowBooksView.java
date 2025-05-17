package com.library.features.borrowbooks;

public class BorrowBooksView {
	private final BorrowBooksModel model;
	
	public BorrowBooksView() {
		model = new BorrowBooksModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Borrow books view - " +model);
	}
}
