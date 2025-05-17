package com.library.features.users.search;

public class UserSearchModel {
private final UserSearchView view;

public UserSearchModel(UserSearchView usersearchview) {
	view = usersearchview;
}

void init() {
	System.out.println("user search model - " +view);
}
}
