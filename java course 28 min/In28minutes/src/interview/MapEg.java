package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEg {
public static void main(String[] args) {
	HashMap t = new HashMap();
	t.put(null,1);
	Set s = t.keySet();
	Iterator iter = s.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
}
}
