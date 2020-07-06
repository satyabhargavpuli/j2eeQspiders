package com._28min.setcollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeEgg {

	public static void main(String[] args) {
		
             // Set<Integer> data = );
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Set.of(65, 54, 34,12, 99));
		
		System.out.println(treeSet.lower(99));
		System.out.println(treeSet.headSet(65));
	}
}
