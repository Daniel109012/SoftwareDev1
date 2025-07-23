package samples;

import javax.swing.JOptionPane;

public class Person {
	
	//instance variables
	private String name;
	private String address;
	private int age;
	
	public Person() {
		String output = "The constructor is being called";
		JOptionPane.showMessageDialog(null, output);
	}
	
	public Person(String name, String address, int age) {
		setName(name);
		setAddress(address);
		setAge(age);
	}
	
	public Person(String name) {
		this(name, "Not known yet", -99);
		/* don't do this
		setName(name);
		setAddress("Not known yet");
		setAge(-99);
		*/
	}

	public String toString() {
		String output;
		
		output = "My name is " +this.name;
		output = output + " and I live in " +this.address;
		output = output + " and I am " +this.age +" years old";
	
		return output;
	}//end toString
	
	public void printDetails() {
		String output;
		
		output = toString();
		
		JOptionPane.showMessageDialog(null, output);
	}//end printDetails
	
	//getters and setters
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAdrress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}//end class Person
