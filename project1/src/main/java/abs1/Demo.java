package abs1;

public class Demo implements Show,Detail {
	public void showDetails(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main (String args[]) {
		Demo mid = new Demo();
		mid.showDetails("anu", 45);
	}

}
