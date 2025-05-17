package com.library.features.books.details;

public class DetailsModel {
	private final DetailsView view;
	
	public DetailsModel(DetailsView detailsview) {
		view = detailsview;
	}
	
	void init() {
		System.out.println("Details model - " +view);
	}
}
