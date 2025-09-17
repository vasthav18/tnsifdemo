package com.tnsif.basics;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.nextLine();
		System.out.println("enter your salary:");
		int sal = sc.nextInt();
		System.out.println("the name is" + name + "salary is" + sal);
	}

}
