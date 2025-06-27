package Practical;

import javax.swing.JOptionPane;

public class Question01 {
	public static void main(String[] args) {
		/*
		 * 1.	Write a program that reads 5 numbers into an array and prints out the value of each number that has a value less than 10.
		 */
		
		int[] myArray = new int[5];
		int numbers;
		String output = "";
		String input;
		
		for(int count = 0; count < myArray.length; count++) {
			input = JOptionPane.showInputDialog("Enter number for Array: " + (count + 1) + " \n "); 
			numbers = Integer.parseInt(input); //make input into an Integer
			myArray[count] = numbers;
		} //End for loop
		
		output = "You Entered: \n";
				for(int count = 0; count < myArray.length; count++ ) {
					//list only Values less than 10
					if(myArray[count] < 10) {
						output = output + myArray[count] + " \n";
					}//Exit if

				} //Exit for loop
				

				
				JOptionPane.showMessageDialog(null, output);

	} //End main

} //End class
