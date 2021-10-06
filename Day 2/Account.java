package com.hsbc.Summary;

import java.util.Scanner;

public class Account {
	
	private int accountNumber;
	private int balance;
	private long ifsc;
	private int dailyLimit;
	private String nomineeName;
	

	public Account(int accountNumber, int balance, long ifsc) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.ifsc=ifsc;
	}
	
	public Account(int accountNumber, int balance, long ifsc, int dailyLimit, String nomineeName ) {
		this(accountNumber,balance,ifsc);
		this.dailyLimit=dailyLimit;
		this.nomineeName=nomineeName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getIfsc() {
		return ifsc;
	}
	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}
	
	public int getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(int dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public void display() {
		
		Account a2=new Account(accountNumber, balance, ifsc);
		//a1.display();
		System.out.println("Account number is :"+a2.getAccountNumber());
		System.out.println("Balance amount is :"+a2.getBalance());
		System.out.println("IFSC number is :"+a2.getIfsc());
	}
	
	public void displayAll() {
		Account a4=new Account(accountNumber, balance, ifsc, dailyLimit, nomineeName);
		System.out.println("Account number is :"+a4.getAccountNumber());
		System.out.println("Balance amount is :"+a4.getBalance());
		System.out.println("IFSC number is :"+a4.getIfsc());
		System.out.println("Daily limit number is :"+a4.getDailyLimit());
		System.out.println("Nominee name is :"+a4.getNomineeName());
	}

}
