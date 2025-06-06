package com.library.features.books.search;

import java.util.List;
import java.util.stream.Collectors;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.Book;

class SearchModel extends BaseModel {
	private final SearchView view;
	
	public SearchModel(SearchView searchview) {
		view = searchview;
	}
	
	void init() {
		
	}
	
	void searchByName(String name) {
		if(name == null || name.trim().isEmpty()) {
			view.showMessage("Please enter a valid name. ");
			return;
		}
		List<Book> books = LibraryDb.getInstance().getAllBooks().stream()
				.filter(book -> book.getName().toLowerCase().contains(name.toLowerCase()))
				.collect(Collectors.toList());
		
		view.displayBooks(books);
	}
	
	void searchByAuthor(String author) {
		if (author == null || author.trim().isEmpty()) {
            view.showMessage("Please enter a valid author name.");
            return;
        }

        List<Book> books = LibraryDb.getInstance().getAllBooks().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());

        view.displayBooks(books);
	}
	
	void searchByGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            view.showMessage("Please enter a valid genre.");
            return;
        }

        List<Book> books = LibraryDb.getInstance().getAllBooks().stream()
                .filter(book -> book.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());

        view.displayBooks(books);
    }
	
	
}
