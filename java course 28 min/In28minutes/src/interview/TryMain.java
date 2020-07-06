package interview;

import java.util.LinkedList;

public class TryMain {
public static void main(String[] args) {
	               LinkedList<String> object = new LinkedList<String>();
	               
	               object.add("A");
	               object.add("B");
	               System.out.println(object);

	               object.addLast("C");
	               System.out.println(object);

	               object.add(2, "D");
	               object.add("E");
	               object.add("F");
	               System.out.println(object);
	               object.remove("B");
	               System.out.println(object);
	               object.remove(3);
	               System.out.println(object);
	               object.removeFirst();
	               System.out.println(object);
	               object.removeLast();
	               System.out.println(object);
	               int size = object.size();
	              Object element = object.get(1);
	              System.out.println(object);
	              object.set(1,"Y");
	              System.out.println(object);
	               
}
}
