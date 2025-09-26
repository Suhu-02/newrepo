package abs;

public class Cat implements Pet{
public void test() {
	System.out.println("second method");
}

public static void main(String args[]) {
Dog d= new Dog();
d.test();
Pet p = new Dog();
p.test();
p= new Cat();
p.test();
}
}