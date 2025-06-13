package com.library.features.users.search;

import java.util.List;
import java.util.stream.Collectors;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.User;

class UserSearchModel extends BaseModel{
	
private final UserSearchView view;

public UserSearchModel(UserSearchView usersearchview) {
	view = usersearchview;
}

void searchByName(String name) {
	if(name == null || name.trim().isEmpty()) {
		view.showMessage("Please enter a valid name. ");
		return;
	}
	List<User> users = LibraryDb.getInstance().getAllUsers().stream()
			.filter(user -> user.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
					user.getLastName().toLowerCase().contains(name.toLowerCase()))
			.collect(Collectors.toList());
	view.displayUsers(users);
}

void searchByEmail(String email) {
	if(email==null || email.trim().isEmpty()) {
		view.showMessage("Please enter a valid email. ");
		return;
	}
	List<User> users = LibraryDb.getInstance().getAllUsers().stream()
			.filter(user -> user.getEmail().toLowerCase().contains(email.toLowerCase()))
			.collect(Collectors.toList());
	view.displayUsers(users);
}

void searchByMobile(String mobile) {
    if (mobile == null || mobile.trim().isEmpty()) {
        view.showMessage("Please enter a valid mobile number.");
        return;
    }

    List<User> users = LibraryDb.getInstance().getAllUsers().stream()
            .filter(user -> user.getMobileNumber().contains(mobile))
            .collect(Collectors.toList());

    view.displayUsers(users);
}
}
