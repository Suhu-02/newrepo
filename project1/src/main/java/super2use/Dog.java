package super2use;  //superkeyword 2nd use example

public class Dog extends Animal {
	Dog()
	{
		super();
		System.out.println("Dog is created");
	}
	
	public static void main (String args[])
	{
		Dog d = new Dog();
	}
}
