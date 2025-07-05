package Samples;

import javax.swing.JOptionPane;

public class method02 {

	public static void main(String[] args) {
		// a method that returns a value
		
		
		String output;
		int yourAge;
		
		//call method readAge
		yourAge = readAge();
		
		//print message from method
		output = "You are " + yourAge + " Years of Age";
		
		//print Dialog Box
		JOptionPane.showMessageDialog(null, output, "Methods02", JOptionPane.INFORMATION_MESSAGE);
		

	}//end main
	
	//method to read age
	//int in method is return type
	public static int readAge() {
		//input
		String ageAsString;
		int age;
		
		//read in age
		ageAsString = JOptionPane.showInputDialog("please enter your age");
		
		//convert to int
		age = Integer.parseInt(ageAsString);
		
		return age;
		
	}// end readAge
	

}// end class
