package com.tnsif.inheritence;

public class HybridInher {

	public static void main(String[] args) {
		 System.out.println("Manager Details");
	        Manager m = new Manager();
	        m.inputDetails();
	        m.inputEmployeeDetails();
	        m.inputManagerDetails();
	        m.displayManagerDetails();

	        System.out.println("\nIntern Details");
	        Intern i = new Intern();
	        i.inputDetails();
	        i.inputInternDetails();
	        i.displayInternDetails();

	}

}
