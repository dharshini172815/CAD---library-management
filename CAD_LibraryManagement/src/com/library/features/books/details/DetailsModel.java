package com.library.features.books.details;

import java.util.Optional;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.Book;

class DetailsModel extends BaseModel{
	private final DetailsView view;
	
	public DetailsModel(DetailsView detailsview) {
		view = detailsview;
	}
	
	void getBookDetails(String bookId) {
		if(bookId==null || bookId.trim().isEmpty()) {
			view.showMessage("Please enter a valid book ID. ");
			return;
		}
		
		Optional<Book>book =  LibraryDb.getInstance().getAllBooks().stream()
				.filter(b -> b.getId().equals(bookId))
				.findFirst();
		view.displayBookDetails(book.orElse(null));
	}
}
