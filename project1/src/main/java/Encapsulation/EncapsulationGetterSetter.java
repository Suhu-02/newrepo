package Encapsulation;

public class EncapsulationGetterSetter {
    private int accNumber;
    private int accBalance;

    // Setter for both account number and balance
    public void setAccountBalance(int accBalance, int accNumber) {
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }

    public int getAccountBalance() {
        return accBalance;
    }

    public int getAccountNumber() {
        return accNumber;
    }
}