package com.library.features.users.manage;

public class UserManageModel {
private final UserManageView view;

public UserManageModel(UserManageView usermanageview) {
	view = usermanageview;
}

void init() {
	System.out.println("User manage model - " +view);
}
}
