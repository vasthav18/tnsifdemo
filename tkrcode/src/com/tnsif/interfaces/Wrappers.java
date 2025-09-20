package com.tnsif.interfaces;

public class Wrappers {
	
	public static void main(String[] args) {
		// integers
		 int x = 200;
	        Integer obj1 = new Integer(x);  
	        System.out.println("Boxing: " + obj1);
		
		int i = 100;
		Integer i1 = i;
		System.out.println("Auto Boxing of int:" + i1);
		
		int i2 = i1;
		System.out.println("Auto UnBoxing of int:" + i2);
		
		// byte - data type
		byte b = 1;
		Byte b1 = new Byte(b);
		System.out.println(" Boxing of byte:" + b1);
		
		Byte b2 = b;
		System.out.println(" Auto Boxing of byte:" + b2);
		
		byte b3 = b2;
		System.out.println("Auto unBoxing of byte:" + b3);
		
		// short - data type
		short s = 30;
		Short s1 = new Short(s);
		System.out.println(" Boxing of short:" + s1);
		
		Short s2 = s;
		System.out.println("Auto Boxing of short:" + s2);
		
		short s3 = s2;
		System.out.println("Auto unBoxing of short:" + s3);
		
		// float data type
		float f = 14.14f;
		Float f1 = f;
		System.out.println("AutoBoxing of float:" + f1);
		
		float f2 = f1;
		System.out.println("Auto UnBoxing of float:" + f2);	
		
		//double data type
		double d = 823.7892;
		Double d1 = d;
		System.out.println("Auto Boxing of double:" + d1);
		
		Double d2 = d1;
		System.out.println("Auto unBoxing of double:" + d2);	
		
		//char data type
		char c= 'c';
		Character c1 = c;
		System.out.println("Auto Boxing of character:" + c1);
		
		char c2 = c1;
		System.out.println("Auto unBoxing of character:" + c2);	
		
		// boolean data type
		boolean boo  = true;
		Boolean bool = boo;
		System.out.println("Auto Boxing of boolean:" + bool);
		
		boolean bo = bool;
		System.out.println("Auto unBoxing of boolean:" + bo);	
	}
}
