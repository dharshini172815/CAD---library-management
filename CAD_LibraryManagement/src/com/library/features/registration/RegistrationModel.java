package com.library.features.registration;

class RegistrationModel {
	private final RegistrationView view;
	
	public RegistrationModel(RegistrationView registrationview) {
		view = registrationview;
	}
	
	void init() {
		System.out.println("Registration model - " +view);
	}
}

