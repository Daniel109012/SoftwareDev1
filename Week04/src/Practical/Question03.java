package Practical;

import javax.swing.JOptionPane;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * 3.	Write a program to read in 10 student's marks (integers between 0 and 100). Store the results in an integer array. 
		 * The program should print out the frequency of the grades achieved. The program should also validate the marks as they are entered.
			mark	grade
			75 - 100	A
			60 – 74		B
			50 - 59		C
			0 - 50		F
		 */
		
		String input;
		String output;
		int markNumber = 4;
		int[] theMarks = new int[markNumber];
		int marks;
		int maxMarkA = 100;
		int minMarkA = 75;
		int maxMarkB = 74;
		int minMarkB = 60;
		int maxMarkC = 59;
		int minMarkC = 50;
		
		output = "Grade/Mark for Students: \n";
		
		for(int grades = 0; grades < theMarks.length; grades++) {
			input = JOptionPane.showInputDialog("Enter the grade for students" + (grades + 1) + " :");
			marks = Integer.parseInt(input);
			theMarks[grades] = marks;
			
			if(theMarks[grades] < 0 || theMarks[grades] > 100) {
				input = JOptionPane.showInputDialog("Enter a Valid Grade from 0 to 100 " + (grades + 1) + " :");
				marks = Integer.parseInt(input);
			}//End if
			
			if(theMarks[grades] >= minMarkA  || theMarks[grades] == maxMarkA) {
				output = output + "Your Grade is:  " + theMarks[grades] + " and your Mark is: A \n";
			}
			else if(theMarks[grades] >= minMarkB  || theMarks[grades] == maxMarkB) {
				output = output + "Your Grade is:  " + theMarks[grades] + " and your Mark is: B \n";
			}
			else if(theMarks[grades] >= minMarkC  || theMarks[grades] == maxMarkC) {
				output = output + "Your Grade is:  " + theMarks[grades] + " and your Mark is: C \n";
			}
			else {
				output = output + "Your Grade is:  " + theMarks[grades] + " and your Mark is: F \n";
			}
			
		}//End for loop
		
		JOptionPane.showMessageDialog(null, output);
	}//End main

}//end class
