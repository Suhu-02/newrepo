package Collection; //HashSet example

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main (String args[]) {
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		System.out.println(fruits);
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
