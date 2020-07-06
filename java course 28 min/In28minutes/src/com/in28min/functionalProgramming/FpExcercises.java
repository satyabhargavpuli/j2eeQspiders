package com.in28min.functionalProgramming;

import java.util.List;

public class FpExcercises {

	public static void main(String[] args) {
		List<String> datas = List.of("satya", "bhargav", "ramesh", "srinivas");
		
		
		datas.stream().map(e -> e.toUpperCase()).forEach(es -> System.out.println(es));
	  
		datas.stream().map(e -> e.length()).forEach(es -> System.out.println(es));

		
	}
}
