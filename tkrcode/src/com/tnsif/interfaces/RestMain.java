package com.tnsif.interfaces;

public class RestMain {

	public static void main(String[] args) {
		Desserts d = new Desserts();
		d.eat();
		d.price();
		
		MainMenu m = new MainMenu();
		m.eat();
		m.price();

	}

}
