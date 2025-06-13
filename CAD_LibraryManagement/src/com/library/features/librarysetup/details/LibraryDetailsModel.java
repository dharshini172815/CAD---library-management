package com.library.features.librarysetup.details;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.Library;

class LibraryDetailsModel extends BaseModel {
	private final LibraryDetailsView view;
	
	public LibraryDetailsModel(LibraryDetailsView view) {
		this.view = view;
	}
	
	void getLibraryDetails() {
		Library library = LibraryDb.getInstance().getLibrary();
		view.displayLibraryDetails(library);
	}

}
