package com.in28min.functionalProgramming;

import java.util.List;


public class FnPrg {

	public static void main(String[] args) {
		List<Integer> som =  List.of(0, 2, 3, 6, 9);
		
		som.stream().forEach(done -> System.out.println(done));
		
		
	fpSum(som);
	}

	private static void fpSum(List<Integer> som) {
		int sum =	som.stream()
				.filter(cal -> cal%2==1)
				.reduce(0, (num1,num2) -> num1 + num2);
		System.out.println("total is"+ sum);
	}
	int a = 10;
	int b = 20;
	

	
	//int sum = (a,b)-> a+b;
		
	}
	
