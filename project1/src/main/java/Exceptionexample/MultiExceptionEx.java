package Exceptionexample; //ex for multiple exception

public class MultiExceptionEx {
	public static void main(String args []) {

	System.out.println("execution checking");
	
	try {
		int ar[]=  new int[5];
		ar[6]= 50/0;
		int x = 500/0;
		System.out.println("hai");
	}
	
	catch(ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println(ae.getMessage());
	}
	catch(Exception e) {
		e.printStackTrace();	
	}
	
	System.out.println("rest of the code");
}
}

