package Metheroveride;

public class Surgeon extends Doctor {
	public void treatPatient() {
		System.out.println("appointment ready");
	}
	
	public static void main(String args[]) {
		Doctor doc = new Doctor();
		doc.treatPatient();
		Surgeon sur= new Surgeon();
		sur.treatPatient();
	}
	
}
