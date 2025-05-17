package com.library.features.books.search;

public class SearchView {
	private final SearchModel model;
	
	public SearchView() {
		model = new SearchModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Search view - " +model);
	}
}
