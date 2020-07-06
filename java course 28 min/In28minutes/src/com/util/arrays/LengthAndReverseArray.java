
package com.util.arrays;

public class LengthAndReverseArray {

	public static void main(String[] args) {
		String [] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	String NoOfcharInDay = "";
	
	for (String day : days) {
		if(day.length()>NoOfcharInDay.length()) {
			NoOfcharInDay = day;
		}
	}

	System.out.println("it is having more no of letters"+NoOfcharInDay);
	
	System.out.println("printing the days in reverse order");
	for (String data : days) {
		
	}
	}
}
