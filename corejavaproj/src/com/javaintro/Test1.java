package com.javaintro;

public class Test1 {
	
	static Test1 t3=new Test1();
	
	static void method1(){
		System.out.println("method1 called");
		method2();
	}
	
	static void method2(){
		System.out.println("method2 called");
		t3.method3();
	}
	
	void method3(){
		System.out.println("method3 called");
		method4();
		
	}
	void method4() {
		System.out.println("method4 called");
	}
	
	static {
		method1();
	}

	static public void main(String supraj[]) {
		System.out.println("main method started");
		
		
		
		
		System.out.println("main method ended");
	}

}
