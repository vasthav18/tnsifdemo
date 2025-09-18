package com.tnsif.keys;

class Student {
	String name;
	int rollno;
	static String clg = "TKR COLLEGE";
	
	Student(String n,int r) {
		name = n;
		rollno = r;
	}
	void details() {
		System.out.println("the name of student is " + name + " rollno " + rollno + " college is " + clg);
	}
}
public class Static {

	public static void main(String[] args) {
		Student s1 = new Student("vasthav",45);
		Student s2 = new Student("sri",18);
		s1.details();
		s2.details();
	}
	
}
