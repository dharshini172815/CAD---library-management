package com.library.features.books.details;

public class DetailsView {
	private final DetailsModel model;
	
	public DetailsView() {
		model = new DetailsModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Details view - " +model);
	}
}
