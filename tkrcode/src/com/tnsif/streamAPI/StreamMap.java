package com.tnsif.streamAPI;
import java.util.*;
import java.util.stream.*;


public class StreamMap {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> squaredNumbers = numbers.stream()
	                                              .map(n -> n * n)
	                                              .collect(Collectors.toList());

	        System.out.println("Squared Numbers: " + squaredNumbers);
	}

}
