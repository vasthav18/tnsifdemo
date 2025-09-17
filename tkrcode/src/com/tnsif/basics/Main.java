package com.tnsif.basics;

//Main.java
public class Main {
 public static void main(String[] args) {
     
     Car myCar = new Car();

     // Access using getters
     System.out.println(myCar.color);
     System.out.println(myCar.seats);
     System.out.println(myCar.company);
     myCar.start();
     myCar.stop();
     
 }
}

