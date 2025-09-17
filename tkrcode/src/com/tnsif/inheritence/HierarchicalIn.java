package com.tnsif.inheritence;


public class  HierarchicalIn{
	public static void main(String[] args) {
        // Create objects for each subclass
        Starters s = new Starters();
        MainMenu m = new MainMenu();
        Desserts d = new Desserts();

        // Take user details once
        s.takeCustomerDetails();

        // Display menus
        s.showStarters();
        m.showMainMenu();
        d.showDesserts();
    }
}