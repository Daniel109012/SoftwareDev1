package practice;

import javax.swing.JOptionPane;

public class Question02 {

	public static void main(String[] args) {
/*
 * 2.	Using a class, write a method called printInteger() that takes an integer as an argument and prints the integer. 
 * Write a program to demonstrate your method being called from main().
 */
		String output;
		int integer01;
		
		//call the retrun from method printInteger and enters it in integer01 from main
		integer01 = printInteger();
		
		output = "You entered " + integer01;
		JOptionPane.showMessageDialog(null, output, "Method02", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main
	
	public static int printInteger() {
		
		String integerAsString;

		int integer01;
		
		integerAsString = JOptionPane.showInputDialog("Enter an Integer");
		integer01 = Integer.parseInt(integerAsString);
		

		
		return integer01;
		
		
	}//end method printInteger

}//end class
