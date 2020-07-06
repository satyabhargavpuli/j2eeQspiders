package com.in28min.multithreading;

class Check extends Thread{
	
		public void run() {
			System.out.println("thread 1");

			for (int i = 101; i <= 199; i++) {
		      System.out.print(i+" ");		
		      System.out.println("\nTask 1 done");

			}
		      System.out.println("\nthread 1 ended");

		}
}
 class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\nthread 2");

		for (int i = 201; i <= 299; i++) {
		      System.out.print(i+" ");		
		      System.out.println("\nTask 2 done");

			}
	}
	
}

public class ThreadBasicRunner {

public static void main(String[] args) throws InterruptedException {
	 
	Check c = new Check();
	c.start();
	
	Thread2 threadTwo = new Thread2();
	Thread t = new Thread(threadTwo);
	t.start();
	t.join();
	
	System.out.println("\nthread 2");

	for (int i = 201; i <= 299; i++) {
	      System.out.print(i+" ");		
	      System.out.println("\nTask 2 done");

		}
	System.out.println("\nthread 3");
	for (int i = 301; i <= 399; i++) {
	      System.out.print(i+" ");		
	      System.out.println("\nTask 3 done");
	      System.out.println("\nMain done");
		}
}
}
