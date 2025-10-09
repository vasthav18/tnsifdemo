package com.tnsif.streamAPI;
import java.util.*;
import java.util.stream.*;

public class StreamCollect {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("john", "alice", "bob");

	        List<String> upperNames = names.stream()
	                                       .map(String::toUpperCase)
	                                       .collect(Collectors.toList());

	        System.out.println("Uppercase Names: " + upperNames);

	}

}
