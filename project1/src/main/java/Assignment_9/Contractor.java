package Assignment_9; //first question

public class Contractor extends Employee {
    int workingHours;

    Contractor(int paymentPerHour, int workingHours) {
        super(paymentPerHour);
        this.workingHours = workingHours;
    }

    int calculateSalary() {
        return paymentPerHour * workingHours;
    } {

}
}
