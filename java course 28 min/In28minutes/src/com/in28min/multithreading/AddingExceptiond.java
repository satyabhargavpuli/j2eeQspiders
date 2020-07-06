package com.in28min.multithreading;

public class AddingExceptiond {

	public static void main(String[] args) {
		method1();
		System.out.println("main ()");
	}

	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	@SuppressWarnings("null")
	private static void method2() {
		
		
//			String s = null;
//			s.length();
			
			try {
				int data [] = {12,24};
				int number   = data[3];
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (Exception e) {
					e.printStackTrace();
				}
			System.out.println("method1 ended");
		

	}
}
