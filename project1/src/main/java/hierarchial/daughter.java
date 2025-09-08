package hierarchial;

public class daughter extends father {
	public void daughterdata() {
		System.out.println("daughter is good");
	}
	
	public static void main(String args[]) {
		
		daughter obj= new daughter();
		obj.daughterdata();
		obj.method1();
		son s1= new son();
		s1.sondata();
		s1.method1();
		
	}

}

