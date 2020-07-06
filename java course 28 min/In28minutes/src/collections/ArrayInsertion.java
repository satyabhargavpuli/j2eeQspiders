package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayInsertion {

	public static <T> void main(String[] args) {
		List<Integer> arrayData = List.of(2, 4, 6);
		ArrayList<Integer> intData = new ArrayList(arrayData);
		
		
		intData.add(1, 12);
		System.out.println(intData);
		intData.set(3, 8);
		System.out.println(intData);
		
		ListIterator<Integer> g = intData.listIterator();
		while (g.hasNext()) {
			//g.
			Integer integer = (Integer) g.next();
			
		}
		/*
		 * Iterator<Integer> looping = intData.iterator(); while (looping.hasNext()) {
		 * System.out.print(looping.next()+" "); }
		 */
		
		
		//System.out.println(intData);
	}
}
