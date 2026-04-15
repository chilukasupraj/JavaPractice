package com.javaintro;

public class TestDemo2 {

	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("main method started");
		//bootstrap class loader
		Class.forName("com.javaintro.Bank");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		//application class loader
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ended");
	}

}
