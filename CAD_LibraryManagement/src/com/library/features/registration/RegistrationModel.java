package com.library.features.registration;

import com.library.features.base.BaseModel;
import com.library.repository.db.LibraryDb;
import com.library.repository.dto.LoginPage;
import com.library.repository.dto.RegistrationPage;

public class RegistrationModel extends BaseModel{
	private final RegistrationView view;
	
	public RegistrationModel(RegistrationView registrationview) {
		view = registrationview;
	}
	
	void init() {
	        if (LibraryDb.getInstance().getRegistrationInfo() != null) {
	            view.proceedLogin();
	        } else {
	            view.proceedRegistration();
	        }
	}

	void registerUser(RegistrationPage registration) {
		if (ifAlreadyExist(registration.getUserName())) {
            view.showErrorMessage("Username already exists");
        }
        else if(isWeakPassword()){ 
            view.showErrorMessage("Please enter Strong Password");
        }
        else{
            LibraryDb.getInstance().setRegistrationInfo(registration);
            view.onRegistrationSuccess(registration);
        }
		
	}
	
	

	private boolean isWeakPassword() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean ifAlreadyExist(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	public void loginUser(LoginPage login) {
		
	}

	public void validateCredentials(String userName, String password) {
		if(LibraryDb.getInstance().validateLoginIngo(userName, password)) {
			view.onSuccessLogin(userName);
		}
		else {
			view.onValidCredentials();
		}
		
	}
}

