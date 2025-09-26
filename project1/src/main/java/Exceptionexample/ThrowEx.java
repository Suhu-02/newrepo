package Exceptionexample; //throw example

public class ThrowEx {
	
	public static void validate(int age) {
    if (age < 18) {
        throw new ArithmeticException("Person not eligible");
    } else {
        System.out.println("Yes, eligible");
    }
}

public static void main(String[] args) {
    validate(5);  // This will throw an exception because age < 18
}

}