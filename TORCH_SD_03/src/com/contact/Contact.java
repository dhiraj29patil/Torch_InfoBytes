package com.contact;

public class Contact {
	private String name;
	private String mobile_no;
	private String email;
	
	
	public Contact() {
		
	}


	public Contact(String name, String mobile_no, String email) {
		super();
		this.name = name;
		this.mobile_no = mobile_no;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contact [Name=" + name + ", Mobile No=" + mobile_no + ", Email=" + email + "]";
	}
	
	
}
