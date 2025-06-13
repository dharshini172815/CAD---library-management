package com.library.features.users;

import java.util.List;
import java.util.Scanner;

import com.library.features.base.BaseView;
import com.library.repository.dto.User;
import com.library.features.librarysetup.LibrarySetupView;
import com.library.features.users.details.UserDetailsView;
import com.library.features.users.manage.UserManageView;
import com.library.features.users.search.UserSearchView;

public class UsersView extends BaseView{
	
	private final UsersModel model;
	private final Scanner scanner = new Scanner(System.in);
	
	public UsersView() {
		model = new UsersModel(this);
	}
	
	public void init() {
		showMenu();
	}
	
	private void showMenu() {
		while(true) {
			System.out.println("\n=== User Management ===");
            System.out.println("1. Add/Manage Users");
            System.out.println("2. List All Users");
            System.out.println("3. Search Users");
            System.out.println("4. View User Details");
            System.out.println("5. Back to Main Menu");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            try {
            	int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        new UserManageView().init();
                        break;
                    case 2:
                        model.listAllUsers();
                        break;
                    case 3:
                        new UserSearchView().init();
                        break;
                    case 4:
                        new UserDetailsView().init();
                        break;
                    case 5:
                        new LibrarySetupView().showMainMenu();
                        return;
                    case 6:
                        logoutApp();
                        return;
                    case 7:
                        exitApp();
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }catch(NumberFormatException e) {
            	System.out.println("Please enter a valid number. ");
            }
		}
	}
	
	

	public void displayUsers(List<User> users) {
		if (users.isEmpty()) {
            System.out.println("\nNo users found.");
            return;
        }

        System.out.println("\n=== User List ===");
        System.out.printf("%-15s %-20s %-20s %-15s %-15s%n",
                "User ID", "First Name", "Last Name", "Email", "Mobile");
        System.out.println("--------------------------------------------------------------------------------");
        
        for (User user : users) {
            System.out.printf("%-15s %-20s %-20s %-15s %-15s%n",
                    user.getUserId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail(),
                    user.getMobileNumber());
        }
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
