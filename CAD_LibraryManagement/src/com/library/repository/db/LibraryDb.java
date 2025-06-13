package com.library.repository.db;

import java.util.*;

import com.library.repository.dto.Book;
import com.library.repository.dto.Library;
import com.library.repository.dto.RegistrationPage;
import com.library.repository.dto.User;

public class LibraryDb {
	private static LibraryDb slibraryDb;
	
	private LibraryDb() {
		
	}
	
	public static LibraryDb getInstance() {
		if(slibraryDb == null) {
			slibraryDb = new LibraryDb();
		}
		return slibraryDb;
	}
	
	private RegistrationPage info;
	private Library library;
	private List<Book> books =  new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
	public RegistrationPage getRegistrationInfo() {
		return info;
	}


	public void setRegistrationInfo(RegistrationPage info) {
		this.info = info;
	}
	
	public Library getLibrary() {
		return library;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public boolean validateLoginIngo(String userName, String password) {
		return info.getUserName().equals(userName) && info.getPassword().equals(password);
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getAllBooks() {
		return new ArrayList<>(books);
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public List<User> getAllUsers() {
		return new ArrayList<>(users);
	}
	

}
