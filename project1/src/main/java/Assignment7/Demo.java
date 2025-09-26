package Assignment7;

public class Demo {
	public static void main(String[] args) {
        Student student = new Student();
        Address addr = new Address();

        // Set details
        student.getDetails("Alice", 101);
        addr.getAddress("123 Main Street, City");

        // Print details
        System.out.println("Student Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Address: " + addr.address);
    }

}
