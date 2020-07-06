package com.whileLoop.statements;

public class SquaresAndCubes {

	private   int number;
	
	public SquaresAndCubes(int number) {
		this.number=number;
	}
	public   void printSquaresUptoLimit() {
	while(number*number<=30) {
		System.out.println(number * number);
		number++;
	}
	}
	public   void printCubesUptoLimit() {
		number=0;
		while(number*number*number<30) {
			System.out.println(number*number*number+" ");
			number++;
		}
	}
	

	

}
