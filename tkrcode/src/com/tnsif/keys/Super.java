package com.tnsif.keys;
class SuperParent {
	String name = "vasthav";
	 void naam() {
		System.out.println("Parent name in method says Hello :" + name);
	}
}

class SuperChild extends SuperParent {
	String name = "sri";
	 void naam() {
		System.out.println("Child name:" + name);
	}
	void display() {
		naam();
		System.out.println("Parent name:" + super.name);
		super.naam();
	}
}

public class Super {

	public static void main(String[] args) {
		SuperChild sc = new SuperChild();
//		sc.naam();
		sc.display();
	}

}
