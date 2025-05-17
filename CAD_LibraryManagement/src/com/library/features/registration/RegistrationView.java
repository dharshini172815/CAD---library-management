package com.library.features.registration;


public class RegistrationView {
	private final RegistrationModel model;
	
	public RegistrationView() {
		model =  new RegistrationModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Registration view - " +model);
	}
	
}
