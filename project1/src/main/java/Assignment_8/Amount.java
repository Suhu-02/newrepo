package Assignment_8; // assignment 8 second question

public class Amount {
	public static void main(String[] args) {
        Bank bank = new Bank();
        User user = new User();

        // User enters pin
        int enteredPin = user.enterPin();

        // Set and validate pin in bank
        bank.setPin(enteredPin);
        bank.validatePin();
    }

}
