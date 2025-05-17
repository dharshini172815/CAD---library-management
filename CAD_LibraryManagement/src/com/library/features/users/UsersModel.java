package com.library.features.users;

public class UsersModel {
	private final UsersView view;
	
	public UsersModel(UsersView usersview) {
		view = usersview;
	}
	
	void init() {
		System.out.println("Users model - " +view);
	}
}
