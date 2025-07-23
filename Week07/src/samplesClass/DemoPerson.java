package samplesClass;

public class DemoPerson {

	public static void main(String[] args) {
		
		
		
		Person p1 = new Person("Daniel", "Benque", 32);
		Person p2 = new Person("Dani", 30);
		Person p3 = new Person();
		
		
		p3.setName("Daniel");
		p3.setAddress("Benque");
		p3.setAge(34);
		
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();



	}

}
