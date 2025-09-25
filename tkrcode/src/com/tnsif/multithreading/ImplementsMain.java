package com.tnsif.multithreading;

public class ImplementsMain {

	public static void main(String[] args) {
		ThreadImplements ti = new ThreadImplements();
		Thread rn = new  Thread(ti);
		rn.start();
		

	}

}
