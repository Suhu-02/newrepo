package Assignment_8;  // assignment 8 second question

public class Bank {
	private int pin;

    // Method to set pin from User
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to validate pin
    public void validatePin() {
        if (pin == 1001 || pin == 1234 || pin == 1212) {
            System.out.println("Pin is correct. You can withdraw money.");
        } else {
            System.out.println("Invalid Pin. Access Denied.");
        }
    }

}
