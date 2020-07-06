package com._28min.setcollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEg {

	public static void main(String[] args) {
		Set<Integer> lHashSet = new LinkedHashSet<Integer>();
		lHashSet.add(543210);
		lHashSet.add(5432);
		lHashSet.add(543);
		lHashSet.add(54);
		lHashSet.add(5);
		System.out.println(lHashSet);
	}
}
