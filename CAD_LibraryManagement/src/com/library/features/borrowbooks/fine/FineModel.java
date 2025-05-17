package com.library.features.borrowbooks.fine;

public class FineModel {
	private final FineView view;
	
	public FineModel(FineView fineview) {
		view = fineview;
	}
	
	void init() {
		System.out.println("Fine model - " +view);
	}
}
