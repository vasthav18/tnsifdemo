package com.tnsif.collections;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements: " + stack);

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop an element
        System.out.println("Popped element: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after pop: " + stack);

        // Search for an element
        int position = stack.search(20);
        if (position != -1)
            System.out.println("Element 20 found at position: " + position);
        else
            System.out.println("Element 20 not found");

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Size of stack
        System.out.println("Current size of stack: " + stack.size());
    }
}
