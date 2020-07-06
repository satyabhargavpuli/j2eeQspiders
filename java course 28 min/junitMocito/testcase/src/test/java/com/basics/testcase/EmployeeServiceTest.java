package com.basics.testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class EmployeeServiceTest {


		@Test
		 void test() {
	        EmployeeService employeeService = mock(EmployeeService.class);
	        when(employeeService.add()).thenReturn(10);
	        int count = employeeService.add();
	        assertEquals(10, count);
		}
		
		

	

}
