package com.library.features.users.details;

import java.util.Optional;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.User;

class UserDetailsModel extends BaseModel{
	private final UserDetailsView view;
	
	public UserDetailsModel(UserDetailsView detailsview) {
		view = detailsview;
	}
	
	void getUserDetails(String userId) {
		if(userId == null || userId.trim().isEmpty()) {
			view.showMessage("Please enter a valid user ID.");
			return;
		}
		
		Optional<User> user = LibraryDb.getInstance().getAllUsers().stream()
				.filter(u -> u.getUserId().equals(userId))
				.findFirst();
		
		view.displayUserDetails(user.orElse(null));
	}
}
