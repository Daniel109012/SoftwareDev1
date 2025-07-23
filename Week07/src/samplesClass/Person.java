package samplesClass;

import javax.swing.JOptionPane;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	public Person() {
//        constructor without parameters
//		String output;
//		
//		output = "The Constructor was called";
//		
//		//display message
//		JOptionPane.showMessageDialog(null, output);
		
	}
	
	
	public Person(String name, String address, int age) {
//      constructor with parameters 
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(name, "Unknown", age);
	}
	
	public String toString() {
		String output;
		
		output ="My name is " +this.name  + " and I am " + this.age + " years old" + " I live at " + this.address; //calls from get___()
		
		return output; //return toString()
	}
	
	public void printDetails() {
		String output;
		
		output = toString(); //call toSting()
		
		//display message
		JOptionPane.showMessageDialog(null, output);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
