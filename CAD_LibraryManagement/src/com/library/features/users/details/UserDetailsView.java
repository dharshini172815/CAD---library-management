package com.library.features.users.details;

public class UserDetailsView {
	private final UserDetailsModel model;
	
	public UserDetailsView() {
		model = new UserDetailsModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Details view - " +model);
	}
}
