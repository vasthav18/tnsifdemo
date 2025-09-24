package com.tnsif.strings;

public class StringMethods {

	public static void main(String[] args) {
		 // Creating strings
        String str1 = " Hello World ";
        String str2 = "Java Programming";
        String str3 = "hello world";

        // length()
        System.out.println("Length of str1: " + str1.length());

        //  charAt()
        System.out.println("Character at index 4: " + str1.charAt(4));

       
        //  contains()
        System.out.println("Does str2 contain 'Java'? " + str2.contains("Java"));

        //  equals() 
        System.out.println("str1 equals str3? " + str1.equals(str3));
        

        // compareTo()
        System.out.println("Comparing str1 & str3: " + str1.compareTo(str3));

        //  toLowerCase() & toUpperCase()
        System.out.println("Lowercase str2: " + str2.toLowerCase());
        System.out.println("Uppercase str2: " + str2.toUpperCase());

        // trim()
        String s = "   vasthav  ";
        System.out.println("Trimmed string: '" + s.trim() + "'");

        //  replace()
        System.out.println("Replace 'Java' with 'C++': " + str2.replace("Java", "C++"));
        
        // concat()
        System.out.println("Concatenated: " + str1.concat(str2));
        
        // split()
        String[] words = str2.split(" ");
        System.out.println("Splitting str2:");
        for (String w : words) {
            System.out.println(w);
        }

	}

}
