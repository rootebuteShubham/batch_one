package com.greatlearning.model;

public class Customer {
	private String bankAccountNo;
	private String password;
	
	// Define a Constructor
	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo  = bankAccountNo;
		this.password = password;
	}
	
	// Create getters and setters
	//getter
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	//setter
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}

