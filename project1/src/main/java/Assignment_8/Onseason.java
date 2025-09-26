package Assignment_8; //assignment 8 first question

public class Onseason {
	
	public void discount(double price) {
		
        double discountedPrice = price - (price * 0.40);
        System.out.println("Onseason purchase:");
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }

}
