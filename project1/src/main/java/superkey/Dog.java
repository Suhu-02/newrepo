package superkey;   //superkeyword 1st use example

public class Dog extends Animal {
    String colour = "black";

    public void printColour() { 
        System.out.println(colour);
        System.out.println(super.colour);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColour(); 
    }
}
