package com.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//Static Arrays
		
		int[] arr = new int[3]; //declaring and initializing
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 6;
		System.out.println(arr[1]);
		
		
		// Dynamic Arrays
		
		int[] arr1 = {4,5,6,10,3}; //declaring and initializing
		
		System.out.println(arr1[0]);
		
		for(int i=0; i<arr1.length; i++) {
		    System.out.println(arr1[i]);
		}
	}

}
