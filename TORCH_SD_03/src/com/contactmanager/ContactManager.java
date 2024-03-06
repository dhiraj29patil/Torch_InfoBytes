package com.contactmanager;

import java.util.ArrayList;
import java.util.Scanner;

import com.contact.Contact;

public class ContactManager {

	private ArrayList<Contact> contacts;
	private Scanner sc;
	
	public ContactManager() {
		contacts = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	public void addContact(String name, String mobile_no, String email) {
		contacts.add(new Contact(name, mobile_no, email));
		System.out.println("Contact Added Successfully");
	}
	
	public void deleteContact(int index) {
		if(index >= 0 && index < contacts.size()) {
			contacts.remove(index);
			System.out.println("Contact Deleted Successfully");
		}
		else {
			System.out.println("Invalid Index, Please enter the Valid Index");
		}
	}
	
	public void viewContact() {
		if(contacts.isEmpty()) {
			System.out.println("Contact List is Empty");
		}
		else {
			for(Contact con : contacts) {
				System.out.println(con);
			}
		}
	}
	
	public void editContact(int index, String mobile_no, String email) {
		if(index >= 0 && index < contacts.size()) {
			Contact con = contacts.get(index);
			con.setMobile_no(mobile_no);
			con.setEmail(email);
			System.out.println("Contact Updated Successfully");
		}
		else {
			System.out.println("Please enter the Valid Index");
		}
	}
}
