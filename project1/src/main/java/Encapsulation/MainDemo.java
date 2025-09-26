package Encapsulation;

public class MainDemo {
    public static void main(String[] args) {
        EncapsulationGetterSetter en = new EncapsulationGetterSetter();

        // Correct way: use setter to set values
        en.setAccountBalance(999, 12345);  // accBalance = 999, accNumber = 12345

        // Use getter methods to print values
        System.out.println("Account Balance: " + en.getAccountBalance());
        System.out.println("Account Number: " + en.getAccountNumber());
    }
}

