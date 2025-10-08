package com.tnsif.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, will be ignored

        System.out.println("Fruits Set: " + fruits);

        // Check size
        System.out.println("Size of HashSet: " + fruits.size());

        // Check if an element exists
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Contains 'Grapes'? " + fruits.contains("Grapes"));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate using Iterator
        System.out.println("Iterating over HashSet:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        // Clear all elements
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}

