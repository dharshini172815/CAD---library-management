package com.library.features.users.search;

public class UserSearchView {
private final UserSearchModel model;

public UserSearchView() {
	model = new UserSearchModel(this);
}

public void init() {
	model.init();
	System.out.println("user search view - " +model);
}
}
