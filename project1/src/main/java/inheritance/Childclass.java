//single inheritance pgm
package inheritance;

public class Childclass extends Parentclass {
	public void leaves() {
		
		System.out.println("green leaves");
	}

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		
		obj.flowers();
		obj.leaves();
		

	}

}
