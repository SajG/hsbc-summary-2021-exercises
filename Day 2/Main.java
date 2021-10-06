package com.hsbc.Summary;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		int accountNumber;
		int balance;
		long ifsc;
		int dailyLimit = 0;
		String nomineeName = null;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		accountNumber=sc.nextInt();
		System.out.println("Enter the balance:");
		balance=sc.nextInt();
		System.out.println("Enter the ifsc code:");
		ifsc=sc.nextLong();
		System.out.println("Enter the daily limit:");
		dailyLimit=sc.nextInt();
		System.out.println("Enter the nominee name:");
		nomineeName=sc.next();
		System.out.println("----------------------------");
		
		System.out.println("Display main account");
		Account a1=new Account(accountNumber, balance, ifsc);
		a1.display();
		
		System.out.println("----------------------------");
		System.out.println("Display Saving Account details");
		Account a=new Savings(accountNumber, balance, ifsc, dailyLimit);
		a.display();
		
		System.out.println("----------------------------");
		System.out.println("Display Current Account details");
		Account b=new Current(accountNumber, balance, ifsc, nomineeName);
		b.display();
		
		System.out.println("----------------------------");
		System.out.println("Display All the details");
		Account a3=new Account(accountNumber, balance, ifsc, dailyLimit, nomineeName);
		a3.displayAll();
	}

}
