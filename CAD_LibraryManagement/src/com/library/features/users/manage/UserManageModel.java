package com.library.features.users.manage;

import java.util.List;
import java.util.UUID;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.User;

public class UserManageModel extends BaseModel{
	
	private final UserManageView view;

	public UserManageModel(UserManageView usermanageview) {
		view = usermanageview;
	}
	
	void addUser(User user) {
		if(validateUser(user)) {
			user.setUserId(generateUserId());
			LibraryDb.getInstance().addUser(user);
			view.showSuccessMessage("User added successfully!");
		}else {
			view.showErrorMessage("Invalid user information. Please try again. ");
		}
	}
	
	void viewAllUsers() {
		List<User> users = LibraryDb.getInstance().getAllUsers();
		view.displayUsers(users);
	}
	
	private boolean validateUser(User user) {
		return user != null &&
	               user.getFirstName() != null && !user.getFirstName().trim().isEmpty() &&
	               user.getLastName() != null && !user.getLastName().trim().isEmpty() &&
	               user.getEmail() != null && user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$") &&
	               user.getMobileNumber() != null && user.getMobileNumber().matches("\\d{10}") &&
	               user.getAddress() != null && !user.getAddress().trim().isEmpty() &&
	               user.getDob() != null && user.getDob().matches("\\d{2}/\\d{2}/\\d{4}");
	}
	
	private String generateUserId() {
		return "USR" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	}

}
