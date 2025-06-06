package com.library;

import com.library.features.books.BooksView;
import com.library.features.books.details.DetailsView;
import com.library.features.books.manage.ManageView;
import com.library.features.books.search.SearchView;
import com.library.features.borrowbooks.BorrowBooksView;
import com.library.features.borrowbooks.feedback.FeedbackView;
import com.library.features.borrowbooks.fine.FineView;
import com.library.features.librarysetup.LibrarySetupView;
import com.library.features.registration.RegistrationView;
import com.library.features.users.details.UserDetailsView;
import com.library.features.users.manage.UserManageView;
import com.library.features.users.search.UserSearchView;

public class Main {
	public static final String appVersion = "0.0.1";
	
	public static final String appName = "LibroScope";
	public static void main(String[] args) {
		System.out.println("Welcome to " +appName+ " - version: " +appVersion);
		new RegistrationView().init();
//		new LibrarySetupView().init();
//		new BorrowBooksView().init();
//		new BooksView().init();
//		new DetailsView().init();
//		new ManageView().init();
//		new SearchView().init();
//		new FeedbackView().init();
//		new FineView().init();
//		new UserDetailsView().init();
//		new UserManageView().init();
//		new UserSearchView().init();
		
	}
}
