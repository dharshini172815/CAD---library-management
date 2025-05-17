package com.library.features.borrowbooks.fine;

public class FineView {
	private final FineModel model;
	
	public FineView() {
		model = new FineModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Fine view - " +model);
	}
}
