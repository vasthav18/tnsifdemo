package com.tnsif.constructor;

class Sample {
	Sample() {
		System.out.println("This is constructor");
	}
	public void show1() {
		System.out.println("This is method");
}
}

public class Constr {
	public static void main(String[] args) {
		Sample ob = new Sample();
		ob.show1();
	}
}
