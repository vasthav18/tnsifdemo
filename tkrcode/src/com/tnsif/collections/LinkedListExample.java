package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Add at first and last
        fruits.addFirst("Mango");
        fruits.addLast("Grapes");
        System.out.println("After adding first & last: " + fruits);

        // Get elements
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());
        System.out.println("Fruit at index 2: " + fruits.get(2));

        // Set element at index
        fruits.set(2, "Orange");
        System.out.println("After updating index 2: " + fruits);

        // Remove elements
        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove("Banana");
        System.out.println("After removals: " + fruits);

        // Check if contains an element
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // Size and empty check
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());

        // Clear all
        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
