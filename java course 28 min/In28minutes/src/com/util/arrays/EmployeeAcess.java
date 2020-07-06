package com.util.arrays;

import java.math.BigDecimal;

public class EmployeeAcess {

	
	public static void main(String[] args) {
		
		int[] marks = {35,60,90};
		
		EmployeeArray employeeArray = new EmployeeArray("bhargav",marks);
		int number = employeeArray.getNumberOfMarks();
		
		System.out.println("number of marks is "+number);
		int sum = employeeArray.getTotalSumOfMarks();
		System.out.println("total marks gained"+" "+sum);
		int maximumMark = employeeArray.getMaximumMark();
		System.out.println(maximumMark);
		int minimumMark = employeeArray.getMinimumMark();
		System.out.println(minimumMark);
		BigDecimal average = employeeArray.getAverageMarks();
		System.out.println("avg marks is"+average);
		employeeArray.addNewMark(35);
		System.out.println(employeeArray);
		employeeArray.removeMarkAtIndex(5);
		
		System.out.println(employeeArray);
	}
}
