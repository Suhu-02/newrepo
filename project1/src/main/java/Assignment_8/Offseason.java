package Assignment_8; //assignment 8 first question

public class Offseason {
	
	public void discount(double price) {
        double discountedPrice = price - (price * 0.15);
        System.out.println("Offseason purchase:");
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }

}
