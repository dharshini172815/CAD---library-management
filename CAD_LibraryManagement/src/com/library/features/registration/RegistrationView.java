package com.library.features.registration;

import com.library.features.base.BaseView;
import com.library.features.librarysetup.LibrarySetupView;
import com.library.repository.dto.RegistrationPage;

import java.util.Scanner;

public class RegistrationView extends BaseView {
	private final RegistrationModel model;
	private final Scanner scanner = new Scanner(System.in);
	
	public RegistrationView() {
		model =  new RegistrationModel(this);
	}
	
	public void init() {
		model.init();
//		System.out.println("Registration view - " +model);
	}

    public void onRegistrationSuccess(RegistrationPage registration) {
        System.out.println("Registration successful!");
        init();
    }


    public void proceedRegistration() {
        System.out.println("Please!Provide the following information:");
        RegistrationPage registration = new RegistrationPage();
        registration.setUserName(getUserName("Enter user name ", "username should not be empty and length min 3 and max 20 \n\nEnter valid username: "));
        registration.setPassword(getPassword());
        model.registerUser(registration);
    }

	private String getUserName(String initialInfo, String errorInfo) {
		String userName = "";
		System.out.println(initialInfo);
		do {
			userName = scanner.nextLine();
			if(userName.length()<3 || userName.length() > 20) System.out.println(errorInfo);
			else break;
		}while(true);
		return userName;
	}
	
	private String getPassword() {
		String password = "";
		System.out.println("Enter password : ");
		do {
			password = scanner.nextLine();
			if(password.length() < 8 || password.length() > 32) {
				System.out.println("Password should not be empty and length min 8 and max 32\n\nEnter valid password: ");
			}
			else break;
		}while(true);
		System.out.println("Confirm password");
		do {
			String confirmPassword = scanner.nextLine();
			if(!password.equals(confirmPassword)) {
				System.out.println("Password did not match.  \n\nEnter confirm password again");
			}
			else break;
		}while(true);
		return password;
	}

	public void showErrorMessage(String usernameAlreadyExists) {
        System.out.println("Error! Username already exists!");
        proceedRegistration();
    }

    public void proceedLogin() {
    	System.out.println("Do you want to proceed to login ? Y/N");
    	String choice = scanner.nextLine();
    	if(choice.equalsIgnoreCase("Y")) {
    		model.validateCredentials(getUserName("Enter user name for login", "Enter valid user name"), getPasswordForLogin());
    	}else {
    		exitApp();
    	}
    }

	private String getPasswordForLogin() {
		String password = "";
		System.out.println("Enter password");
		do {
			password = scanner.nextLine();
			if(password.length()<8 || password.length()>32) System.out.println("Enter valid password");
			else break;
		}while(true);
		return password;
	}

	public void onSuccessLogin(String userName){
    	System.out.println("Logged in successfully!");
    	System.out.println("Welcome " +userName);
        new LibrarySetupView().init();;
    }

	public void onValidCredentials() {
		System.out.println("Username and password did not match");
		System.out.println("Do you want to proceed ? type Y or N");
		if(scanner.nextLine().equalsIgnoreCase("Y")) {
			proceedLogin();
		}
	}
    

	
}
