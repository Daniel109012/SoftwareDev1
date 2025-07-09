package practice;

import javax.swing.JOptionPane;

public class Question08 {

	public static void main(String[] args) {
		/*
		 * 8.	Using a class write a method to print the name, address and age of a person, the method signature is shown.

		void printDetails(String, String, int);

		Using the same class write a method to print the name and address of a person, the method signature is shown.

		void printDetails(String, String);

		Add a method to print the name and age.

		void printDetails(String,  int);

		Can you now add a method to print the address and age?  If you can, go ahead, if not why not?
		Demonstrate each of your methods working.
 			it gives an error as both methods have a string and an integer giving an error, will need to rename one.

		 */
		
		String name;
		String address;
		String ageAsString;
		int age;
		
		name = JOptionPane.showInputDialog("enter your Name");
		
		address = JOptionPane.showInputDialog(" Enter your address");
		
		ageAsString = JOptionPane.showInputDialog("Enter your age");
		age = Integer.parseInt(ageAsString);
		
		printDetails(name, address, age);
		printDetails(name, address);
		printDetails(name, age);
		printDetails1(address, age);

	}//end main
	
	public static void printDetails(String name, String address, int age) {
		
		String output;
		output = "Your name is " + name + ", your live at " + address + ", and your age is " + age;
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	public static void printDetails(String name, String address) {
		
		String output;
		output =  name + ", your live at " + address;
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	public static void printDetails(String name,  int age) {
		
		String output;
		output =  name + ", your age is " + age;
		JOptionPane.showMessageDialog(null, output);
		
		
	}
	
	public static void printDetails1(String address,  int age) {
		
		String output;
		output =  " you live at " + address + ", and your age is " + age;
		JOptionPane.showMessageDialog(null, output);
		
		
	}

}
