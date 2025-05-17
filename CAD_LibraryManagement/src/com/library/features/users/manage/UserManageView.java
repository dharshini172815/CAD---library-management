package com.library.features.users.manage;

public class UserManageView {
private final UserManageModel model;

public UserManageView() {
	model = new UserManageModel(this);
}

public void init() {
	model.init();
	System.out.println("User manage view - " +model);
}
}
