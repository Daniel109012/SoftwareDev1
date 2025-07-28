package practical;

import java.util.Stack;

import javax.swing.JOptionPane;

public class EmploymentSimulator {
	
	private Stack<Employee> employees;
	
	public EmploymentSimulator() {
		employees = new Stack<>();
		
	}
	
	public void employ(Employee p) {
		employees.push(p);
	}
	
	public void makeRedundant() {
		StringBuilder output = new StringBuilder();
		if(!employees.isEmpty()) {
			Employee redundant = employees.pop();
			output.append("made redundant: \n" + redundant);
		}else {
			output.append("No Employees to make redundant. ");
		}
		JOptionPane.showMessageDialog(null, output);
	}
	
	public void printNextForTheChop() {
		StringBuilder output = new StringBuilder();
		if(!employees.isEmpty()) {
			output.append("Next for the chop: \n" + employees.peek() + "\n");
		}else {
			output.append("No Employees to chop.");
		}
		JOptionPane.showMessageDialog(null, output);
	}
	
	public int campanySize() {
		
//		return employees.size();
		String output = (" Company Size: " + employees.size());
		JOptionPane.showMessageDialog(null, output);
		return 0;
	}
	
	public void printEmployees() {
		StringBuilder output = new StringBuilder();
		if(employees.isEmpty()) {
			output.append("No Employees in the complany.");
		}else {
			output.append("Current Employees: \n");
			for(int i = employees.size() - 1; i >= 0; i--) {
				output.append(employees.get(i));
			}
		}
		JOptionPane.showMessageDialog(null, output.toString());

	}

}
