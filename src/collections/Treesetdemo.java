package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
