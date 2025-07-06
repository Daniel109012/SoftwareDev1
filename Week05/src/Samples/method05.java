package Samples;

import javax.swing.JOptionPane;

public class method05 {

	public static void main(String[] args) {
		// Passing multiple parameters
		
		String ageAsString;
		String name;
		int age;
		
		//ask user for details
		ageAsString = JOptionPane.showInputDialog("Please enter your age");
		age = Integer.parseInt(ageAsString);
		
		name = JOptionPane.showInputDialog("Please enter your Name");
		
		printDetails(name, age);
		

	}//end main
	
	public static void printDetails(String aName, int anAge) {
		String output;
		
		output = aName + " is " + anAge + " years old";
		JOptionPane.showMessageDialog(null, output, "Mehtod05", JOptionPane.INFORMATION_MESSAGE);
	}//END printDetails

}//end class
