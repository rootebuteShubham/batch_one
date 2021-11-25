package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	
	//Create Objects
	private static Scanner sc = new Scanner(System.in);
	private static Customer customer = new Customer("GL00001234","password123");
	private static Banking banking = new Banking();
	
	public static void main(String[] args) {
		int choice;
		int amount;
		String recipientbankAccountNo;
		
		displayWelcomeMessage();
		if(isCredentialsOk()) {
			System.out.println("Successfully authenticated");
			do {
				displayMenu();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						System.out.println("Enter the amount to deposit");
						amount = sc.nextInt();
						// peform the deposit operation
						banking.deposit(amount);
						break;
						
					case 2:
						System.out.println("Enter the amount to withdraw");
						amount = sc.nextInt();
						// peform the withdraw operation
						banking.withdraw(amount);
						break;
					case 3:
						System.out.println("Enter the amount to tranfer");
						amount = sc.nextInt();
						System.out.println("Enter the recipient account number");
						recipientbankAccountNo = sc.next();
						// perform the transfer operation
						banking.transfer(amount,recipientbankAccountNo);
						break;
				
				}
			
		} while(choice !=4);
			} else {
			System.out.println("Authentication Failure");
		}
	}
	
	
	private static void displayMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Transfer");
		System.out.println("4.Log out");
		
		System.out.println("-----------------------------------------");
	}
	
	private static void displayWelcomeMessage() {
		System.out.println("Welcome to Greatlearning Bank");
	}
	
	private static boolean isCredentialsOk() {
		System.out.println("Enter your account number: ");
		String accountNo = sc.next();
		System.out.println(accountNo);
		
		System.out.println("Enter your password: ");
		String password = sc.next();
		System.out.println(password);
		
		return customer.getBankAccountNo().equals(accountNo) && customer.getPassword().equals(password);
		
	}
}
