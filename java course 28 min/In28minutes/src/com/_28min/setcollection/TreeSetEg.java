package com._28min.setcollection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {

		List<Character> listchar = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> treeHashSet1 = new TreeSet<>(listchar);

		System.out.println(treeHashSet1);

		Set<Character> LinkedHashSet = new LinkedHashSet<>(listchar);
		System.out.println(LinkedHashSet);
		/*
		 * treeHashSet.add(543210); treeHashSet.add(5432); treeHashSet.add(543);
		 * treeHashSet.add(54); treeHashSet.add(5); System.out.println(treeHashSet);
		 */
	}
}
