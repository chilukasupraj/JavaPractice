package com.languagefun;

import java.lang.System;
import java.lang.String;

import java.util.Scanner;

public class Employee {
	int employee_id;
	String employee_Name;

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee emp1=new Employee();
		System.out.println(emp1.employee_id);
		System.out.println(emp1.employee_Name);
		emp1.hello1();
		
		
		System.out.println("main method ended");

	}
	void hello1() {
		System.out.println("Hello method called");
	}

}
