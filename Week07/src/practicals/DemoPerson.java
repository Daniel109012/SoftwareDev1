package practicals;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p1 = new Person();
		
		Person[] p2 = new Person[3];
		p2[0] = new Person("John", 21, "Chicago");
		p2[1] = new Person("Alise", 25, "LA");
		p2[2] = new Person ("Robert", 40, "Belize");
		
		for(int i = 0; i < p2.length; i++) {
		p2[i].printDetails();
		}
		
		p1.printDetails();

	}
	
	

}
