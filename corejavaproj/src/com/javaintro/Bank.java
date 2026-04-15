package com.javaintro;

public class Bank {
	//static variable
	static int accountNumber=1234;
	static String accountHolder="Supraj";
	static int balance=500;
	static String branch="Karimnagar";
	//instance variable
	String bankName="SBi";
	
	public static void main(String[] args) {
		//object for reference 
		Bank b=new Bank();
		System.out.println(accountNumber);
		System.out.println(accountHolder);
		System.out.println(balance); 
		System.out.println(branch);
		System.out.println(b.bankName);
		
		
	}

}
