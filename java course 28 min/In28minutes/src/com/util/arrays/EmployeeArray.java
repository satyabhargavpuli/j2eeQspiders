package com.util.arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeArray {

	private String name;
    private ArrayList<Integer> marks =  new ArrayList<Integer>();
	public EmployeeArray(String name,int ... marks) {
		this.name = name;
		
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	public int getNumberOfMarks() {
		return marks.size();
	}
	public int getTotalSumOfMarks() {
//		int sum = 0;
//		for (int mark : marks) {
//			sum+=mark;
//		}
//		return sum ;
		return Collections.max(marks);
	}
	public int getMaximumMark() {
//		// TODO Auto-generated method stub
//		int max = 0;
//	for (int  cal : marks) {
//		if(cal>max)
//		{
//			max=cal;
//		}
//	}
//		
//		
//		return max;
		return Collections.min(marks);
	}
	public int getMinimumMark() {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for (int  cal : marks) {
			if(cal<min)
			{
				min=cal;
			}
		}
		return min;
	}
	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int marks =  getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(marks),3,RoundingMode.UP);
	}
	public void addNewMark(int mark) {
       marks.add(mark);		
	}
	public void removeMarkAtIndex(int i) {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		return name + marks;
	}
	
	
}
