package practicals;

import javax.swing.JOptionPane;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	public Person() {
//		String output;
//		
//		output = "Constructors to be Called";
//		
//		JOptionPane.showMessageDialog(null, output);
	}
	
//	public Person(String name, int age, String address) {
//		=========Array=======		//
		
//		this.name = name;
//		this.age =  age;
//		this.address =  address;
//		
//	}
//	
//	public Person (String name, int age) {
//		
//		this.age = age;
//		this.name = name;
//		this.address = " unknown";
//		
//		
//	}
//	public Person (String name, String address) {
//		
//		this.age = 0;
//		this.name = name;
//		this.address = address;
//	}
//	
//	public Person (int age){
//		
//		this.age = age;
//		this.name = "unknown";
//		this.address = "unknown";
//		
//	}
	
	public String toString() {
		
		String output;
		
		output = "My name is " + this.name + " , I am " + this.age + " \n and I leave at " + this.address;
		
		return output;
		
	}
	
	
//	public String happyBirthday() {
//		
//			String output;
//			
//			output = " I am " + (this.age + 1);
//			
//			return output;
//		
//	}
	
	
	

	
	public void printDetails() {
		
//		=========output Details=========
		
		String output;
		output = toString();
		JOptionPane.showMessageDialog(null, output);
//		output = happyBirthday();
//		JOptionPane.showMessageDialog(null, output);

	}
	
	
//	============get and set methods========
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
