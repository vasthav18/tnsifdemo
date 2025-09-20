package com.tnsif.interfaces;

public interface Animal {
	void eat();
	void sleep();
}

interface Dog extends Animal {
	int a = 10;
	void bark();
}
