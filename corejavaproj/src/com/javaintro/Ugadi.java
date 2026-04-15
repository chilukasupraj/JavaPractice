package com.javaintro;

public class Ugadi {
	
	static {
		method1();
	}
	
	static void method1() {
		System.out.println("method1 started");
		Ugadi m2=new Ugadi();
		m2.method2();
	}
	
	void  method2(){
		System.out.println("method2 started");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		

	}

}
