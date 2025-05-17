package com.library.features.users.details;

public class UserDetailsModel {
	private final UserDetailsView view;
	
	public UserDetailsModel(UserDetailsView detailsview) {
		view = detailsview;
	}
	
	void init() {
		System.out.println("Details model - " +view);
	}
}
