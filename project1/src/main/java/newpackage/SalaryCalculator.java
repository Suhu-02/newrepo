package newpackage;

public class SalaryCalculator {
    double basicPay;
    double deduction;
    double bonus;
    double hra;
    double pf;
    double totalSalary;

    // Constructor to set all input values (simulating input)
    public SalaryCalculator(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.deduction = deduction;
        this.bonus = bonus;
    }

    // Calculate HRA and PF
    public void calculateComponents() {
        this.hra = 0.05 * basicPay;
        this.pf = 0.20 * basicPay;
    }

    // Calculate total salary
    public void calculateTotalSalary() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }

    // Print salary slip
    public void displaySalarySlip() {
        System.out.println("----- Salary Slip -----");
        System.out.println("Basic Pay       : " + basicPay);
        System.out.println("Deduction       : " + deduction);
        System.out.println("HRA (5%)        : " + hra);
        System.out.println("PF (20%)        : " + pf);
        System.out.println("Bonus           : " + bonus);
        System.out.println("Total Salary By Hand: " + totalSalary);
    }

    // Main method with hardcoded input values (simulate input)
    public static void main(String args[]) {
        // Simulating input, no scanner or system.in used
        SalaryCalculator emp = new SalaryCalculator(50000, 2000, 3000);
        
        emp.calculateComponents();
        emp.calculateTotalSalary();
        emp.displaySalarySlip();
    } }

