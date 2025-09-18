package com.tnsif.keys;

class KeyFinal {
	 final int a = 10;
	
	final void show() {
//		 a = 40;
		System.out.println(a);
	}
}
class Child extends KeyFinal {
//	void show() {
//		System.out.println("Cannot execute!");
//	}
	
	
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyFinal k = new KeyFinal();
		k.show();

	}

}
