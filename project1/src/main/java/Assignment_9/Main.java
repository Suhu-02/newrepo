package Assignment_9; //first question

public class Main {
	public static void main(String[] args) {
		
        // Creating objects
        Contractor contractor = new Contractor(100, 5); // 5 working hours
        FullTimeEmployee fullTime = new FullTimeEmployee(120); // 8 hours assumed

        // Print salaries
        System.out.println("Contractor Salary: ₹" + contractor.calculateSalary());
        System.out.println("Full-Time Employee Salary: ₹" + fullTime.calculateSalary());
    }

}
