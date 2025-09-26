package Collection; //non generic collection example

import java.util.ArrayList;

public class NonGenericCollectionsEX {
	

	public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList li = new ArrayList();
        li.add("hello");
        li.add(100);
        li.add(90.7f);
        String space1= (String)li.get(0);
        int space2 = (int)li.get(1);
        float space3 = (float) li.get(2);
        System.out.println(space1);
        System.out.println(space2);
        System.out.println(space3);
	}
}
