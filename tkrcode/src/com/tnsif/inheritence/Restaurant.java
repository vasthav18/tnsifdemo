package com.tnsif.inheritence;
import java.util.Scanner;


public class Restaurant {
 String customerName;
 String mobile;
 String location;

 public void takeCustomerDetails() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your Name: ");
     customerName = sc.nextLine();

     System.out.print("Enter your Mobile: ");
     mobile = sc.nextLine();

     System.out.print("Enter your Location: ");
     location = sc.nextLine();

     System.out.println("\n Customer Details");
     System.out.println("Name: " + customerName);
     System.out.println("Mobile: " + mobile);
     System.out.println("Location: " + location);
 }
}

//Child Class 1
class Starters extends Restaurant {
 public void showStarters() {
     System.out.println(" Starters Menu:");
     System.out.println("1. Spring Rolls");
     System.out.println("2. Paneer Tikka");
     System.out.println("3. Chicken Wings");
     System.out.println("4. Pizza");
     System.out.println();
 }
}


class MainMenu extends Restaurant {
 public void showMainMenu() {
     System.out.println(" Main Menu:");
     System.out.println("1. Veg Biryani");
     System.out.println("2. Butter Chicken");
     System.out.println("3. Paneer Butter Masala");
     System.out.println("4. Dal Tadka with Rice");
     System.out.println();
 }
}


class Desserts extends Restaurant {
 public void showDesserts() {
     System.out.println(" Desserts Menu:");
     System.out.println("1. Gulab Jamun");
     System.out.println("2. Ice Cream");
     System.out.println("3. Chocolate");
     System.out.println("4. Rasmalai");
     System.out.println();
 }
}
