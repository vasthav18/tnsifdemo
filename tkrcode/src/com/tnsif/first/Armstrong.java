package com.tnsif.first;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        sc.close();

	        int original = number;
	        int result = 0;
	        int digits = 0;

	        // Count digits
	        int temp = number;
	        while (temp > 0) {
	            digits++;
	            temp /= 10;
	        }

	        // Calculate sum of powers of digits
	        temp = number;
	        while (temp > 0) {
	            int remainder = temp % 10;
	            result += Math.pow(remainder, digits);
	            temp /= 10;
	        }

	        // Check Armstrong condition
	        if (result == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is not an Armstrong number.");
	        }
	}

}
