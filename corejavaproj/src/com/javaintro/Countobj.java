package com.javaintro;

public class Countobj {
	static int count=0;
	
//constructors dont have return type
	Countobj(){
		count++;
	}

	public static void main(String[] args) {
		new Countobj();
		new Countobj();
		new Countobj();
		
		System.out.println(count);
	}

}
