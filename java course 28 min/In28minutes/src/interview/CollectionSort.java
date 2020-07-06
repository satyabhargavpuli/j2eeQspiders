package interview;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionSort {

	public static Collection sort() {
		Collection sorted = new LinkedList();
		sorted.add("A");
		sorted.add("R");
		sorted.add("O");
		sorted.add("N");
		return sorted;
	}
	public static void main(String[] args) {
		for (Object object : sort()) {
			System.out.println(object);
		}
	}
}
