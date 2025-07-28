package practical;

//import javax.swing.JOptionPane;

public class DemoEmployment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmploymentSimulator sim = new EmploymentSimulator();
		
		sim.employ(new Employee("Alice", "Developer"));
		sim.employ(new Employee("Charlie", "Manager"));
		sim.employ(new Employee("Bob", "Designer"));
		
		
		sim.printEmployees();
		sim.printNextForTheChop();
		sim.makeRedundant();
		sim.printEmployees();
		sim.campanySize();
//		String output = ("Company size: " + sim.campanySize());
//		JOptionPane.showMessageDialog(null, output);

	}

}
