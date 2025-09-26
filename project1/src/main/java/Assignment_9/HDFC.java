package Assignment_9;

public class HDFC implements RBI {

    public void recurringDeposit(double amount, int duration) {
        double maturityAmount;

        // Recurring deposit formula
        maturityAmount = (amount * duration) +
                         (amount * duration * (duration + 1) * INTEREST_RATE) / (2 * 100 * 12);

        System.out.println("Recurring Deposit Details (HDFC):");
        System.out.println("Monthly Deposit: ₹" + amount);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
        System.out.println("Maturity Amount: ₹" + String.format("%.2f", maturityAmount));
    }
}