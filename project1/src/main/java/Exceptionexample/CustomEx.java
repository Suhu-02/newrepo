package Exceptionexample; //custom exception example

//Create a custom exception class
class AgeNotEligibleException extends Exception {
 
 public AgeNotEligibleException(String message) { // Constructor that takes a message
     super(message);
 }
 
 }

public class CustomEx {   
 
 public static void validate(int age) throws AgeNotEligibleException {
     if (age < 18) {
         
         throw new AgeNotEligibleException("Person is not eligible because age is below 18.");
     } else {
         System.out.println("Yes, eligible");
     }
 }

 public static void main(String[] args) {
     try {
         validate(22);  // This will throw the custom exception because age < 18
     } catch (AgeNotEligibleException e) {    	 
       
         e.printStackTrace();   // Handling the custom exception
     } 
   }
 }