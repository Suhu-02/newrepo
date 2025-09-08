package super3use;

public class Child extends Parent {

    void display() {
        System.out.println("same name");
    }

    void Work() { // ✅ Fixed method name (removed dot)
        super.display(); // ✅ Calls Parent's display method
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.Work();
    }
}
