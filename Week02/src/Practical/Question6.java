package Practical;

import javax.swing.JOptionPane;
import java.util.Random;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * 6.   Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
		 */
		
		int[] Number = new int[10];
		int count = 0;
		Random numGenerator = new Random();
		
		while(count < 10) {
			Number[count] = numGenerator.nextInt(100);
			count++;		
		}
		
		int maxNum = Number[0];
		int minNum = Number[0];
		
		for(int num : Number) {
			if (num > maxNum) {
				maxNum = num;
			}
			if(num < minNum) {
				minNum = num;
			}
		}
		
// Prepare the output message
			StringBuilder message = new StringBuilder("The generated numbers are: \n");
 		for (int num : Number) {
 			message.append(num).append(" \n");
 		}
 			message.append("\nThe largest number is: ").append(maxNum);
 			message.append("\nThe smallest number is: ").append(minNum);

// Display the message using JOptionPane
 			JOptionPane.showMessageDialog(null, message.toString());

	}

}
