package com.tnsif.interfaces;

public class MainClass {

	public static void main(String[] args) {
		jio j = new jio();
		j.call();
		j.sms();
		
		samsung s = new samsung();
		s.call();
		s.sms();
	}

}
