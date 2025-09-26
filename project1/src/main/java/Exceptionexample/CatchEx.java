package Exceptionexample; //ex for catch with try

public class CatchEx {
	public static void main(String args []) {

	System.out.println("execution checking");
	
	try {
		int x = 500/0;
		System.out.println("hai");
	}
	
	catch(ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println(ae.getMessage());
	}
	
	System.out.println("rest of the code");
}
}
