package com._28min.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStrgIterate {

	@SuppressWarnings("unlikely-arg-type")
	public static <E> void main(String[] args) {

		List<String> data = List.of("sunny", "bunny", "danny", "money");
		
		List<String> arrayList = new ArrayList<>(data);
		System.out.println(arrayList);
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("nny")) {
				iterator.remove();
			}
		}
		System.out.println("removed others from list"+arrayList);
		
		/*
		 * for (String da : arrayList) { if(da.endsWith("nny")) {
		 * System.out.println(da); //arrayList.remove(da); } //
		 * System.out.println(arrayList); }
		 */
		/*
		 * if(arrayList.("nny")) { System.out.println("present"); } else {
		 * System.out.println("nothing"); }
		 */
	}

}
