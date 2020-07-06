package com.in28min.inheritence;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("bhargav");
		employee.setEmail("satyabhargav.puli@gmail.com");
		employee.setPhoneNumber("9908601717");
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal(25000));
		employee.setTitle("software employee");
		employee.setEmployer("software analyst");
		
		System.out.println(employee);
	}
}
