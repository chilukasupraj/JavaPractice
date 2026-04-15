package com.assignments;

public class Methodspractice1 {

	static void show() {
		int a = method1();
		System.out.println("int value:" + a);

		System.out.println("float value:" + method2());

		System.out.println("String value:" + method3());
	}

	static int method1() {
		return 22;
	}

	static float method2() {
		return 2.2f;
	}

	static String method3() {
		return "Supraj";
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		show();

		System.out.println("main method ended");

	}

}
