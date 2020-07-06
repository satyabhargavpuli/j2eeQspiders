package com.util.arrays;

import java.util.Scanner;


public class BasicInputScanner {
	 public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		  int [] data = getArrayData(6);
		  for (int i : data) {
			System.out.println("values present in array is"+i);
			
		}
			System.out.println("sum of avg data is"+getSumAvg(data));

	}

	private static  int[] getArrayData(int input) {
		
		int [] inputData = new int[input];
		System.out.println("enter the input values"+input+ "integers.\r");
		for (int i = 0; i < inputData.length; i++) {
			inputData[i]= scanner.nextInt();
		}
		return inputData ;
	}
	public static double getSumAvg(int[] val) {
		int sum = 0;
		for (int i = 0; i < val.length; i++) {
			sum+= val[i];
		}
		
		
		return (double)sum/(double)val.length;
		
	}
}
