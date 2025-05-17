package com.library.features.borrowbooks;

public class BorrowBooksModel {
	private final BorrowBooksView view;
	
	public BorrowBooksModel(BorrowBooksView borrowbooksview) {
		view = borrowbooksview;
	}
	
	void init() {
		System.out.println("Borrow books model - " +view);
	}
}
