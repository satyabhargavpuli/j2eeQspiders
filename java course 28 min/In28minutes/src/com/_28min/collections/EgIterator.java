package com._28min.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EgIterator {

	public static void main(String[] args) {
		
		List<Integer> listData = List.of(2,4,6,8);
		
		for (int i = 0; i < listData.size(); i++) {
			System.out.println(listData.get(i));
		}
		System.out.println("*****************");
		for (Integer integer : listData) {
			System.out.println(integer);
		}
		System.out.println("=================");

		Iterator<Integer> iterator = listData.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		
//		List<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.addAll(listData);
//		
//		
//		System.out.println(arrayList);
	}
}
