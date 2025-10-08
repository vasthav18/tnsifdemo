package com.tnsif.collections;

import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Accessing elements
        System.out.println("First fruit: " + fruits.firstElement());
        System.out.println("Last fruit: " + fruits.lastElement());

        // Updating element
        fruits.set(1, "Orange");

        // Removing element
        fruits.remove("Apple");

        // Display vector
        System.out.println("Fruits: " + fruits);

        // Size and capacity
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity());

	}

}
