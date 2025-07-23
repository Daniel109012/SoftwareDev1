package samples;

public class DemoPerson {
	public static void main(String[] args) {
		/*
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("John");
		p1.setAddress("Edinburgh");
		p1.setAge(21);
		p1.printDetails();
		
		p2.setName("fred");
		p2.setAddress("Glasgow");
		p2.setAge(21);
		p2.printDetails();
		*/
		
		Person p3 = new Person("Mary", "Livingston", 21);
		p3.printDetails();
		
		Person p4 = new Person("Bob");
		p4.printDetails();
		
	}

}
