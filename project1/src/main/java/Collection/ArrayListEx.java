package Collection;  //collection arraylist example

import java.util.ArrayList;

public class ArrayListEx {
	
public static void main (String args[]) {
ArrayList<String> cars= new ArrayList<String>();

cars.add("BMW");
cars.add("ford");
cars.add("volvo");
cars.add("maruti");
System.out.println(cars);
cars.remove(2);
System.out.println(cars);
for(int i=0;i<cars.size();i++) {
	System.out.println(cars.get(i));
	
	
}
}
}
