package com.basic;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeTest {
	
	public static void main(String args[]) {
		
		for(Integer i=1;i<50;i++) {
			if(i%15 == 0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
        		.map(n -> n * n)
        		.collect(Collectors.toList());

	}

}
