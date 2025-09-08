package project2;

public class son extends father {
	public void age() {
		
		System.out.println("He is 72");
	}

	public static void main(String[] args) {
		son obj= new son();
		obj.method2();
		obj.details();
		obj.age();
		
	}

}