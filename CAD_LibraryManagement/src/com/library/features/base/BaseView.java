package com.library.features.base;

import com.library.features.registration.RegistrationView;

public abstract class BaseView {
	protected void logoutApp() {
		System.out.println("Logging out . . . . ");
		new RegistrationView().init();
	}
	protected void exitApp() {
		System.out.println("Thank you for using LibraScope!");
		System.exit(0);
	}
	public void showMessage(String message) {
		System.out.println(message);
	}
}
