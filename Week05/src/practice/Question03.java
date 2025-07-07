package practice;

import javax.swing.JOptionPane;

public class Question03 {

	public static void main(String[] args) {
/*
 * 3.	Using a class, write a method called addFiveToInteger() that takes an integer as an argument and returns the integer increased by five.
 * 		Write a program to demonstrate your method being called from main().
 */
		
		String output;
		int num01;
		//input and integer
		String intAsString;
		int addFive;
		
		intAsString = JOptionPane.showInputDialog("Enter a number to add 5");
		num01 = Integer.parseInt(intAsString);
		
		//call num01 from addFiveToInteger to main
		addFive = addFiveToInteger(num01);
		
		output = "The result of adding 5 to the number " + addFive;
		JOptionPane.showMessageDialog(null, output, "Question03", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main
	
	public static int addFiveToInteger(int num01) {
		

		return num01 + 5;
		
	}//end addFiveToInteger

}//end class
