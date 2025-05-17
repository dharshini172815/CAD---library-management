package com.library.features.librarysetup;

class LibrarySetupModel {
	 private final LibrarySetupView view;
	 
	 public LibrarySetupModel(LibrarySetupView librarysetupview) {
			view = librarysetupview;
		}
		
		void init() {
			System.out.println("Library setup model - " +view);
		}
}
