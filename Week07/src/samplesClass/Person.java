package samplesClass;

import javax.swing.JOptionPane;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	public Person() {}
	
	public String toString() {
		String output;
		
		output ="My name is " +this.name + " I live at " + this.address + "\n";
		output = output + "and I am " + this.age + " years old";
		
		return output;
	}
	
	public void printDetails() {
		String output;
		
		output = toString();
		
		//display message
		JOptionPane.showMessageDialog(null, output);
	}

}
