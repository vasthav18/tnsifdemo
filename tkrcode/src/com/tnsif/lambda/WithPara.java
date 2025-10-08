package com.tnsif.lambda;

interface Addition {
    int add(int a, int b);
}

public class WithPara {

	public static void main(String[] args) {
		
		 Addition sum = (a, b) -> a + b;

	        System.out.println("Sum: " + sum.add(10, 20));
	}

}
