package Collection;

import java.util.Set;
import java.util.HashSet;

public class NewHashSetEx {
public static void main (String args[]) {
	Set<String> fruits = new HashSet<>();
	fruits.add("apple");
	fruits.add("orange");
	fruits.add("mango");
	fruits.add("apple");
	System.out.println(fruits);
	Set<String> morefruits = new HashSet<>();
	morefruits.add("grapes");
	morefruits.add("pineapple");
	fruits.addAll(morefruits);
	System.out.println(fruits);
	System.out.println(morefruits);
	fruits.retainAll(morefruits);
	morefruits.isEmpty();
	System.out.println(fruits);
	morefruits.isEmpty();
	System.out.println(morefruits.isEmpty());
	
	
}
}
