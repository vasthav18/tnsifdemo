package com.tnsif.exception;

class TestThrowDemo {
	public static void calAge(int age)
	{
		if(age<18)
			throw new ArithmeticException("The age is less than 18 ");
		else
			System.out.println("Eligible for voting");
	}
	
}

public class Throws {

	public static void main(String[] args) throws Exception {
		
		TestThrowDemo.calAge(2);
	}

}
