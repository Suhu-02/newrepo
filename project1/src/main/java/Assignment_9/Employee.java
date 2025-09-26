package Assignment_9;  //first question

abstract class Employee {
    int paymentPerHour;

    Employee(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    abstract int calculateSalary();
}