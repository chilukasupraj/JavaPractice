package com.lanfundatatypes;

//byte-->short-->int-->long-->float-->double

//reverse typecasting -->explicit type casting 
//small to big conversion of data -->implicit  type casting
public class Datatypes1 {
//range is -128 to 127
	byte b = (byte) 129;
//range is from -32768 to 32767
//if we give more than 32768 will get a CE like below
//Type mismatch:cannot convert from int to short	
	short s = (short) 32768;
	int i = (int) 214665612L;
	long l = 994664846164232L;
//if the rhs value is decimal point data then will consider by default double
//type mismatch:cannot convert from double to float
	float f = 5.9F;
	double d = 5.9;

	float f1 = 99797613165649794613131313F;

	char c = '\u0041';
	int i1 = 'A';
	boolean boo = true;

	public static void main(String[] args) {
		System.out.println("main method started");
		Datatypes1 t1 = new Datatypes1();

		System.out.println("byte value:" + t1.b);
		System.out.println("short value:" + t1.s);
		System.out.println("int value:" + t1.i);
		System.out.println("long value:" + t1.l);
		System.out.println("float value:" + t1.f);
		System.out.println(t1.f1);
		System.out.println("double value:" + t1.d);
		System.out.println("char value:" + t1.c);
		System.out.println(t1.i1);
		System.out.println("boolean value:" + t1.boo);

		System.out.println("main method ended");
	}

}
