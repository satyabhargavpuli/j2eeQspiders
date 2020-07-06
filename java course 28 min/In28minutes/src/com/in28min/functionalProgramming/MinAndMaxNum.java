package com.in28min.functionalProgramming;

import java.util.List;

public class MinAndMaxNum {

	public static void main(String[] args) {
		List<Integer> data = List.of(24, 52, 2, 11, 0);
		
		Integer check = data.stream().min((n1,n2)-> Integer.compare(n1, n2)).get();
	System.out.println(check);	
	}
}
 