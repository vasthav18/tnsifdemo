package com.tnsif.inheritence;
import java.util.Scanner;

public class Person {
	String name;
    int age;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); 
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Single Inheritance
class Employee extends Person {
    String empId;
    String department;

    public void inputEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    public void displayEmployeeDetails() {
        displayDetails();
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
    }
}

// Multilevel Inheritance
class Manager extends Employee {
    int teamSize;

    public void inputManagerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Hierarchical Inheritance
class Intern extends Person {
    String college;
    int duration; 

    public void inputInternDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter College: ");
        college = sc.nextLine();
        System.out.print("Enter Internship Duration (months): ");
        duration = sc.nextInt();
    }

    public void displayInternDetails() {
        displayDetails();
        System.out.println("College: " + college);
        System.out.println("Duration: " + duration + " months");
    }
}
