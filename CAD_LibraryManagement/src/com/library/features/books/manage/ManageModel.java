package com.library.features.books.manage;

public class ManageModel {
	private final ManageView view;
	
	public ManageModel(ManageView manageview) {
		view = manageview;
	}
	
	void init() {
		System.out.println("Manage model - " +view);
	}
}
