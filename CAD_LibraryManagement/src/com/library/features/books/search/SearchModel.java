package com.library.features.books.search;

public class SearchModel {
	private final SearchView view;
	
	public SearchModel(SearchView searchview) {
		view = searchview;
	}
	
	void init() {
		System.out.println("Search model - " +view);
	}
}
