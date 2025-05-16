package com.library.features.librarysetup;


public class LibrarySetupView {
	private final LibrarySetupModel model;
	
	public LibrarySetupView() {
		model =  new LibrarySetupModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Library setup view - " +model);
	}
	
}
