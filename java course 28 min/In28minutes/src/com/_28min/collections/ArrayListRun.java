package com._28min.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListRun {

		public static void main(String[] args) {

		List<String> List1=new ArrayList<String>();

		

		{

		List1.add("I");

		

		}

		List<String> List2=new Vector<String>();

		

		{

		List2.addAll(List1);

		List2.add("am");

		

		}

		List<String> List3=new LinkedList<String>();

		

		{

		List3.addAll(List2);

		List3.add("Java Develper");

		

		}

		List<String> merge=new ArrayList<String>();

		{

		merge.addAll(List3);

		}

		System.out.println("Merge List is "+merge);

		}

		
}
