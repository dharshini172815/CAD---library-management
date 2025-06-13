package com.library.repository.dto;

import java.util.List;

public class LibrarySystem {
	 private List<User> users;
	    private List<Book> books;
	    private List<Borrow> borrows;
	    private List<OverdueFile> overdues;
	    private List<Feedback> feedbacks;
		public List<User> getUsers() {
			return users;
		}
		public void setUsers(List<User> users) {
			this.users = users;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
		public List<Borrow> getBorrows() {
			return borrows;
		}
		public void setBorrows(List<Borrow> borrows) {
			this.borrows = borrows;
		}
		public List<OverdueFile> getOverdues() {
			return overdues;
		}
		public void setOverdues(List<OverdueFile> overdues) {
			this.overdues = overdues;
		}
		public List<Feedback> getFeedbacks() {
			return feedbacks;
		}
		public void setFeedbacks(List<Feedback> feedbacks) {
			this.feedbacks = feedbacks;
		}
}
