package com.whileLoop.statements;

import java.time.*;
import java.time.LocalTime;

public class LoopImplementation {
static int n = 10;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SquaresAndCubes squaresAndCubes = new SquaresAndCubes(1);
	
	squaresAndCubes.printSquaresUptoLimit();
	//System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	squaresAndCubes.printCubesUptoLimit();
	Integer integer = new Integer(n);
	integer.valueOf(5);
	
	System.out.println(LocalDate.now());
	System.out.println(LocalTime.now());
	System.out.println();
	}
}
