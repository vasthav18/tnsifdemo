package com.tnsif.strings;

public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sri");
		System.out.println(sb);
		
		//append method
		System.out.println(sb.append("vasthav"));
		System.out.println(sb);
		
		//insert method
		 sb.insert(5, " Java");
	        System.out.println("After insert: " + sb);

	        // replace() - replaces part of the string
	        sb.replace(6, 10, "Programming");
	        System.out.println("After replace: " + sb);

	        // delete() - deletes a part of the string
	        sb.delete(6, 17);
	        System.out.println("After delete: " + sb);

	        // reverse() - reverses the string
	        sb.reverse();
	        System.out.println("After reverse: " + sb);


	        // length() - shows number of characters
	        System.out.println("Length: " + sb.length());

	       
	        // setCharAt() - changes character at index
	        sb.reverse();
	        sb.setCharAt(0, 's');
	        System.out.println("After setCharAt: " + sb);

	        // substring() - extracts part of the string
	        String sub = sb.substring(0, 5);
	        System.out.println("Substring (0-5): " + sub);

	}

}
