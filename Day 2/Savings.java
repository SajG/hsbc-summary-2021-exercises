package com.hsbc.Summary;

public class Savings extends Account{
	
	private int dailyLimit;
	
	public int getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(int dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public Savings(int accountNumber, int balance, long ifsc, int dailyLimit) {
		super(accountNumber,balance,ifsc);
		this.dailyLimit=dailyLimit;
		
	}
	
	public void display() {
		
		super.display();
		Savings s=new Savings(getAccountNumber(), getBalance(), getIfsc(), dailyLimit);
		System.out.println("Daily limit is :"+s.getDailyLimit());
	}
}
