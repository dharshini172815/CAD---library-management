package com.library;

import com.library.features.registration.RegistrationView;

public class Main {
	public static final String appVersion = "0.0.1";
	
	public static final String appName = "LibroScope";
	
	public static void main(String[] args) {
		System.out.println("\t*****Welcome to " +appName+ "*****\n\t\t\t\t\t - version: " +appVersion);
		new RegistrationView().init();
		
	}
}
