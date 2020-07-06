package interview;

import java.util.Set;
import java.util.TreeSet;

public class SetEg {
public static void main(String[] args) {
	Set s = new TreeSet();
	s.add("Aron");
	s.add(1);
	while(s.iterator().hasNext()) {
		System.out.println(s.iterator().next());
		
		
	}
}
}
