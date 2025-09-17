package com.tnsif.first;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;   // get last digit
            reversed = reversed * 10 + digit; // build reverse
            number /= 10;  // remove last digit
        }

        // Check palindrome condition
        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }

	}

}
