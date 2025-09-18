package com.tnsif.keys;

class Keys {
	int a = 10;
	public void show() {
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
public class This {
	public static void main(String[] args) {
		Keys k = new Keys();
		k.show();
		
	}
}
