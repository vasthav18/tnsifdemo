package com.tnsif.abstraction;

abstract class Shape {
	int area;
	abstract void calArea();
	
	void show() {
		System.out.println("This is Parent class Method");
	}
}

class Square extends Shape {
	Square() {
		System.out.println("Square class Constructor");
	}
	int side = 5;
	void calArea() {
		super.area = side*side;
		System.out.println(area);
	}
}

class Rectangle extends Shape {
	Rectangle(){
		System.out.println("Rectangle class Constructor");
	}
	int l=2;
	int b = 4;
	
void calArea() {
		super.area = l*b;
		System.out.println(area);
	}
}
public class Calculate {

	public static void main(String[] args) {
		Square ob1 = new Square();
		Rectangle ob2 = new Rectangle();
		ob1.calArea();
		ob2.calArea();
	}

}
