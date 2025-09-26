package Assignment_9; //first question

public class FullTimeEmployee extends Employee {
    FullTimeEmployee(int paymentPerHour) {
        super(paymentPerHour);
    }

    int calculateSalary() {
        return paymentPerHour * 8;  // 8 hours/day
    }
}
