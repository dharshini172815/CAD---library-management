package com.library.features.users;

public class UsersView {
	private final UsersModel model;
	
	public UsersView() {
		model = new UsersModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Users view - " +model);
	}
}
