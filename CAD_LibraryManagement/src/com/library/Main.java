package com.library;

import com.library.features.librarysetup.LibrarySetupView;
import com.library.features.registration.RegistrationView;

public class Main {
	public static void main(String[] args) {
		new RegistrationView().init();
		new LibrarySetupView().init();
	}
}
