package com._28min.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEg {

	
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(24);
		arrayList.add(36);
		
		arrayList.remove(Integer.valueOf(24));
		
		List<Integer> arrayList2 = new ArrayList<Integer>(arrayList);
		List<Integer> arrayList3 = new LinkedList<Integer>(arrayList2);
		
		Iterator<Integer> iterator = arrayList3.iterator();
		while (iterator.hasNext()) {
System.out.println(iterator.next());			
		}
		System.out.println(iterator.hasNext());
		for (Integer integer : arrayList) {
			System.out.println("integer array is" + integer);
		}
		System.out.println(arrayList);
	}
	 
	/*
	 * public static void main(String[] args) { List<String> word =
	 * List.of("data1","data2"); System.out.println(word);
	 * 
	 * 
	 * }
	 */
}
