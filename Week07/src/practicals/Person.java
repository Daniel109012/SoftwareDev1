package practicals;

import javax.swing.JOptionPane;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	public Person() {}
	
	public String toString() {
		
		String output;
		
		output = "my name is " + this.name + " and I am " + this.age + " \n and I leave at " + this.address;
		
		return output;
		
	}
	
	public String happyBirthday() {
		
		String output;
		
		output = "my age is " + this.age;
		
		return output;
		
	}
	
	public Person(String name, int age, String address) {
		
		this.name = name;
		this.age =  age;
		this.address =  address;
		
	}
	
	public void printDetails() {
		
		String output;
		output = toString();
		JOptionPane.showMessageDialog(null, output);
		output = happyBirthday();
		JOptionPane.showMessageDialog(null, output);

	}
	

}
