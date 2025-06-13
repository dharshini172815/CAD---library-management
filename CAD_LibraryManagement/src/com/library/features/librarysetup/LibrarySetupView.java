package com.library.features.librarysetup;

import java.util.Scanner;

import com.library.features.base.BaseView;
import com.library.features.librarysetup.details.LibraryDetailsView;
import com.library.repository.dto.Library;

public class LibrarySetupView  extends BaseView{
	private final LibrarySetupModel model;
	private final Scanner scanner = new Scanner(System.in);
	
	public LibrarySetupView() {
		model =  new LibrarySetupModel(this);
	}
	
	public void init() {
		model.init();
	}
	
	public void proceedToSetupLibrary() {
		System.out.println("\n\t***** Library Setup *****\n");
		Library library = new Library();
		library.setName(getLibraryName());
		library.setAddress(getAddress());
		library.setPhoneNo(getPhoneNumber());
		library.setEmailId(getEmail());
		library.setIncharge(getIncharge());
		library.setCapacity(getCapacity());
		library.setOpeningTime(getOpeningTime());
		library.setClosingTime(getClosingTime());
		library.setNoAvailableDays(getAvailableDays());
		model.setupLibrary(library);
	}

	private String getLibraryName() {
		String name = "";
		System.out.print("Enter library name : ");
		do {
			name = scanner.nextLine();
			if(name.length()<3 || name.length()>50) {
				System.out.print("\nLibrary name should not be between 3 and 50 characters\nEnter valid name : \n");
			}else break;
		}while(true);
		return name;
	}
	
	private String getAddress() {
		String address = "";
		System.out.print("Enter library address : ");
		do {
			address = scanner.nextLine();
			if(address.length()<5 || address.length()>100) {
				System.out.print("\nAddress should be between 5 and 100 characters\nEnter valid address : \n");
			}else break;
		}while(true);
		return address;
	}
	
	private String getPhoneNumber() {
		String phone = "";
        System.out.print("Enter Phone Number :");
        do {
            phone = scanner.nextLine();
            if (!phone.matches("\\d{10}"))
                System.out.print("\nPhone number should be 10 digits\nEnter valid phone number : \n");
            else break;
        } while (true);
        return phone;
	}
	
	private String getEmail() {
        String email = "";
        System.out.print("Enter Email Address : ");
        do {
            email = scanner.nextLine();
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                System.out.print("\nInvalid email format\nEnter valid email : \n");
            else break;
        } while (true);
        return email;
    }
	
	private String getIncharge() {
        String incharge = "";
        System.out.print("Enter Library Incharge Name : ");
        do {
            incharge = scanner.nextLine();
            if (incharge.length() < 3 || incharge.length() > 50)
                System.out.print("\nName should be between 3 and 50 characters\nEnter valid name : \n");
            else break;
        } while (true);
        return incharge;
    }
	
	private Integer getCapacity() {
        Integer capacity = null;
        System.out.print("Enter Library Capacity : ");
        do {
            try {
                capacity = Integer.parseInt(scanner.nextLine());
                if (capacity <= 0)
                    System.out.print("\nCapacity should be greater than 0\nEnter valid capacity : \n");
                else break;
            } catch (NumberFormatException e) {
                System.out.print("\nPlease enter a valid number\nEnter valid capacity : \n");
            }
        } while (true);
        return capacity;
    }
	
	private Long getOpeningTime() {
        Long time = null;
        System.out.print("Enter Opening Time (in 24-hour format, e.g., 900 for 9:00 AM) :");
        do {
            try {
                time = Long.parseLong(scanner.nextLine());
                if (time < 0 || time > 2359)
                    System.out.print("\nTime should be between 0000 and 2359\nEnter valid time : \n");
                else break;
            } catch (NumberFormatException e) {
                System.out.print("\nPlease enter a valid time\nEnter valid time : \n");
            }
        } while (true);
        return time;
    }
	
	private Long getClosingTime() {
        Long time = null;
        System.out.print("Enter Closing Time (in 24-hour format, e.g., 1800 for 6:00 PM) : ");
        do {
            try {
                time = Long.parseLong(scanner.nextLine());
                if (time < 0 || time > 2359)
                    System.out.print("\nTime should be between 0000 and 2359\nEnter valid time : \n");
                else break;
            } catch (NumberFormatException e) {
                System.out.print("\nPlease enter a valid time\nEnter valid time : \n");
            }
        } while (true);
        return time;
    }
	
	private Integer getAvailableDays() {
        Integer days = null;
        System.out.print("Enter Number of Available Days per Week (1-7) : ");
        do {
            try {
                days = Integer.parseInt(scanner.nextLine());
                if (days < 1 || days > 7)
                    System.out.print("Days should be between 1 and 7\nEnter valid days : \n");
                else break;
            } catch (NumberFormatException e) {
                System.out.print("\nPlease enter a valid number\nEnter valid days : \n");
            }
        } while (true);
        return days;
    }
	
	public void onLibrarySetupCompleted() {
		System.out.println("\n\t. . . . . . Library setup completed successfully! . . . . .\n");
		showMainMenu();
	}

	public void showMainMenu() {
		while(true) {
			System.out.println("\n\t***** LibraScope Main Menu ***** \n");
            System.out.println("1. Manage Books");
            System.out.println("2. View Books");
            System.out.println("3. Manage Users");
            System.out.println("4. View Users");
            System.out.println("5. View Library Details");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            try {
            	int choice = Integer.parseInt(scanner.nextLine());
            	switch(choice) {
            	case 1:
            		new com.library.features.books.manage.ManageView().init();
            		break;
            	case 2:
            		new com.library.features.books.BooksView().init();
            		break;
            	case 3:
            		new com.library.features.users.manage.UserManageView().init();
            		break;
            	case 4:
            		new com.library.features.users.UsersView().init();
            		break;
            	case 5:
            		new LibraryDetailsView().init();
            		break;
            	case 6:
            		System.out.println("Logging out . . . ");
            		new com.library.features.registration.RegistrationView().init();
            		return;
            	case 7:
            		exitApp();
            	default:
            		System.out.println("Invalid choice. Please try again. ");
            	}
            	
            }catch(NumberFormatException e) {
            	System.out.println("Please enter a valid number. ");
            }
		}
		
	}
	
	public void showErrorMessage(String message) {
		System.out.println(message);
		proceedToSetupLibrary();
	}
	
}
