package Practical;


import javax.swing.JOptionPane;
import java.util.Random;


public class Question6_2 {

	public static void main(String[] args) {
		

		/*
         * 6. Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
         */

		int[] numbers = new int[10];
		Random numGenerator = new Random();
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		StringBuilder message = new StringBuilder("The generated numbers are: \n");

		for (int i = 0; i < 10; i++) {
			numbers[i] = numGenerator.nextInt(100);
			message.append(numbers[i]).append(" \n");
 
			if (numbers[i] > maxNum) {
				maxNum = numbers[i];
			}
			if (numbers[i] < minNum) {
				minNum = numbers[i];
			}
		}

		message.append("\nThe largest number is: ").append(maxNum);
		message.append("\nThe smallest number is: ").append(minNum);

		JOptionPane.showMessageDialog(null, message.toString());
	}	
}

/*

package Practical;

import javax.swing.JOptionPane;

public class Question6_2 {

    public static void main(String[] args) {
        /*
         * 6. Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
         

        int[] numbers = new int[10];
 
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        StringBuilder message = new StringBuilder("The entered numbers are: \n");

        try {
            for (int i = 0; i < 10; i++) {
                String input = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
                numbers[i] = Integer.parseInt(input);
                message.append(numbers[i]).append(" \n");
 
                if (numbers[i] > maxNum) {
                    maxNum = numbers[i];
                }
                if (numbers[i] < minNum) {
                    minNum = numbers[i];
                }
            }

            message.append("\nThe largest number is: ").append(maxNum);
            message.append("\nThe smallest number is: ").append(minNum);

            JOptionPane.showMessageDialog(null, message.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid integers.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage());
        }
    }    
}*/
