package com.library.features.books.manage;

public class ManageView {
	private final ManageModel model;
	
	public ManageView() {
		model = new ManageModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Manage view - " +model);
	}
}
