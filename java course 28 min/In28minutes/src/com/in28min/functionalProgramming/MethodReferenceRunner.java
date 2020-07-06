package com.in28min.functionalProgramming;

import java.util.List;

 


public class MethodReferenceRunner {

	public static void print(Integer num) {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		List.of("Ant", "Bat","Cat", "Dog","Elephant")
		.stream().map(e -> e.length())
		.forEach(s -> System.out.println(s));
	
		List.of("Ant", "Bat","Cat", "Dog","Elephant")
		.stream().map(String::length)
		//.forEach(System.out::println);
	     .forEach(MethodReferenceRunner::print);
		
		
		Integer res = List.of(23, 45, 67, 34).stream().filter(n -> n%2 == 0).max((n1,n2 )-> Integer.compare(n1, n2)).orElse(0);
		System.out.println(res);
	}
}
