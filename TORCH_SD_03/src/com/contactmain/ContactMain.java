package com.contactmain;

import java.util.Scanner;

import com.contactmanager.ContactManager;

public class ContactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactManager conMan = new ContactManager();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1. Add Contact");
			System.out.println("2. View Contacts");
			System.out.println("3. Edit Contact");
			System.out.println("4. Delete Contact");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.println("Please Enter the Valid Choice code : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: //Add Contact
				System.out.println("Enter the Name : ");
				String n = sc.next();
				
				System.out.println("Enter the Mobile Number : ");
				String mn = sc.next();
				
				System.out.println("Enter the Email Id : ");
				String em = sc.next();
				
				conMan.addContact(n, mn, em);
				
				break;
			
			case 2: // View Contact
				conMan.viewContact();
				break;
				
			case 3: //Edit Contact
				System.out.println("Enter the Valid Index : ");
				int idx = sc.nextInt();
				
				System.out.println("Enter the Mobile Number : ");
				mn = sc.next();
				
				System.out.println("Enter the Email ID : ");
				em = sc.next();
				
				conMan.editContact(idx, mn, em);
				
				break;
				
			case 4: //Delete Contact
				System.out.println("Enter the Valid Index : ");
				idx = sc.nextInt();
								
				conMan.deleteContact(idx);
				
				break;
				
			case 5: //Exit
				System.out.println("Thank You!!!");
				System.exit(0);
			
			default:
				System.out.println("Please Enter the Valid Choice Code");
				break;
			}
			
		}while(choice != 5);
		
	}

}
