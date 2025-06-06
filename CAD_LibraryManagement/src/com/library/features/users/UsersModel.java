package com.library.features.users;

import java.util.List;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.User;

class UsersModel extends BaseModel {
	
	private final UsersView view;
	
	public UsersModel(UsersView usersview) {
		view = usersview;
	}
	
	void listAllUsers() {
		List<User> users = LibraryDb.getInstance().getAllUsers();
		view.displayUsers(users);
	}
}
