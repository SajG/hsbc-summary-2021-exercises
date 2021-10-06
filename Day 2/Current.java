package com.hsbc.Summary;

public class Current extends Account{
	
	String nomineeName;
	
	public Current(int accountNumber, int balance, long ifsc, String nomineeName) {
		super(accountNumber,balance,ifsc);
		this.nomineeName=nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
	public void display() {
		super.display();
		Current c=new Current(getAccountNumber(), getBalance(), getIfsc(), nomineeName);
		System.out.println("Nominee name is:"+c.getNomineeName());
	}

}
