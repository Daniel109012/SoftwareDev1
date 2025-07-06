package Samples;

import javax.swing.JOptionPane;

public class method09 {
		
		public static void main(String[] args) {
			// Method Overloading
			
			String ageAsString;
			String name;
			int age;
			
			//ask user for details
			ageAsString = JOptionPane.showInputDialog("Please enter your age");
			age = Integer.parseInt(ageAsString);
			
			name = JOptionPane.showInputDialog("Please enter your Name");
			
			printDetails(name, age);
			
			//ask user for details
			ageAsString = JOptionPane.showInputDialog("Please enter your age");
			age = Integer.parseInt(ageAsString);
			
			name = JOptionPane.showInputDialog("Please enter your Name");
			
			printDetails(age, name);
			

		}//end main
		
		public static void printDetails(int anAge, String aName) {
			String output;
			
			output = "your age is " + anAge + " and your name is " + aName + " ";
			JOptionPane.showMessageDialog(null, output, "Mehtod05", JOptionPane.INFORMATION_MESSAGE);
		}//END printDetails
		
		public static void printDetails(String aName, int anAge) {
			String output;
			
			output = aName + " is " + anAge + " years old";
			JOptionPane.showMessageDialog(null, output, "Mehtod05", JOptionPane.INFORMATION_MESSAGE);
		}//END printDetails

	}//end class


