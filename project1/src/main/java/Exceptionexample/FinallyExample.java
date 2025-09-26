package Exceptionexample; //finally example

public class FinallyExample {
	
    public static void main(String[] args) {
    	
        int data = 50 / 2;
        System.out.println(data);  
        
        try {
            int x = 100 / 0;  // This will throw an ArithmeticException
            
        } catch (Exception ex) {
        	
            ex.printStackTrace();  // This will print the exception stack trace
        } finally {
        	
            System.out.println("hai");  // Corrected 'syso' to 'System.out.println'
        }
        
        System.out.println("su");  // Corrected 'syso' to 'System.out.println'
    }
}
