package Assignment_8; // assignment 8 first question

public class Discount {
	public static void main(String[] args) {
        Offseason off = new Offseason();
        Onseason on = new Onseason();

        // Sample prices
        double price1 = 2000;
        double price2 = 3500;

        off.discount(price1);  // 15% discount
        System.out.println();  // spacer
        on.discount(price2);   // 40% discount
    }

}
