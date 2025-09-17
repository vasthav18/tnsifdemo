package com.tnsif.constructor;

class Parameterized {
	Parameterized(int a,String b) {
		System.out.println("The value of a: " + a + " The value of b:" + b);
	}
	public void show2() {
		System.out.println("method block");
	}
}
public class ParaConstr {

	public static void main(String[] args) {
		Parameterized ob = new Parameterized(4,"hello");
//		ob.show2();
	}

}
