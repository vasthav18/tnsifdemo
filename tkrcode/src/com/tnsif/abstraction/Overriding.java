package com.tnsif.abstraction;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
//    @Override  
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
//    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Overriding {

	public static void main(String[] args) {
		Animal a1 = new Dog();
        a1.sound();   // Dog barks

        Animal a2 = new Cat();
        a2.sound();   // Cat meows

	}

}
