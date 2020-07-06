package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(20);
	l.add(8);
	l.add(5);
	Collections.sort(l);
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}
}
}
