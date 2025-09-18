package com.tnsif.abstraction;

class Student {
    // private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if(age > 0) {   // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
public class Getters_Setters {

	public static void main(String[] args) {
		Student s1 = new Student();

        // using setters
        s1.setName("Vasthav");
        s1.setAge(21);

        // using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

	}

}
