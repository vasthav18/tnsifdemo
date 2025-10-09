package com.tnsif.streamAPI;
import java.util.*;
import java.util.stream.*;

public class StreamCount {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        long count = numbers.stream()
                            .filter(n -> n > 3)
                            .count();

        System.out.println("Numbers greater than 3: " + count);
	}

}
