package com.tnsif.streamAPI;
import java.util.*;
import java.util.stream.*;

public class StreamSorted {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Sorted Names: " + sortedNames);
	}

}
