package com.lanfundatatypes;

import java.math.BigInteger;
import java.math.BigDecimal;

//A class is a user defined data type
class Dog {
	String name;

	Dog(String str) {
		name = str;
	}

}

public class Datatypes2 {

	String str = "Supraj";

	Integer i = 100;// int-->Integer(Converting Primitive to Wrapper Objevt data type will consider
					// as Auto-Boxing)

	int i1 = i;// Integerr-->int
//Converting Wrapper Object data type to Primitive will consider as Auto-Unboxing

//Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi=100;//Invalid
	BigInteger bi = new BigInteger("98878455484512121218487847979561464");
	BigDecimal bd = new BigDecimal("98988764654647979461215454");
	Dog d = new Dog("Puppy");

	public static void main(String[] args) {
		System.out.println("main method started");

		Datatypes2 t = new Datatypes2();

		System.out.println(t.d.name);
		System.out.println(t.str);
		System.out.println(t.i);
		System.out.println(t.bi);
		System.out.println(t.bd);
		System.out.println(t.d);

		System.out.println("main method ended");
	}

}
