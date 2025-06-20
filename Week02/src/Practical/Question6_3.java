package Practical;

import javax.swing.JOptionPane;

public class Question6_3 {


public static void main(String[] args){
	 	/*
         * 6. Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
         */

	 	int[] numbers = new int[10];
 
	 		int maxNum = Integer.MIN_VALUE;
	 		int minNum = Integer.MAX_VALUE;

	 			String message = "The entered numbers are: \n";

	 			for (int i = 0; i < 10; i++) {
	 				String input = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
	 				numbers[i] = Integer.parseInt(input); // This line might throw NumberFormatException
	 				message += numbers[i] + " \n";

	 				if (numbers[i] > maxNum) {
	 					maxNum = numbers[i];
	 				}
	 				if (numbers[i] < minNum) {
	 					minNum = numbers[i];
	 				}
	 			}

	 			message += "\nThe largest number is: " + maxNum;
	 			message += "\nThe smallest number is: " + minNum;

	 			JOptionPane.showMessageDialog(null, message);
	 			
}
}


