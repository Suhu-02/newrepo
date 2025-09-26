package finalkey; //ex for final class

public final class Bike1 {

    public void run() {
        System.out.println("running");
    }

 //   public class Main extends Bike1{

        public static void main(String[] args) {
            Main obj = new Main();
            obj.run();
        }
    }
//}