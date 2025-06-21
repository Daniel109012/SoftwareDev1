package Practical;

import javax.swing.JOptionPane;

public class Question7 {

	public static void main(String[] args) {
		// 7.	 Write a program that inputs 10 student's marks. At the end, the program should print a message saying how many students have passed and how many students have failed. The pass mark is 50%.

	 	int[] numbers = new int[10];
	 	int passMark = 50;
	 	int passCount = 0;
	 	int failCount = 0;
	 	String input;

		String message = "The grades are: \n";

 			for (int i = 0; i < 10; i++) {
 				input = JOptionPane.showInputDialog(null, "Enter Grades " + (i + 1) + ":");
 				numbers[i] = Integer.parseInt(input); // This line might throw NumberFormatException
 				//message += numbers[i] + " %\n";
 				
	 				if(numbers[i] >= passMark) {
	 					message += numbers[i] + " % : 	Passed\n";
 	 					passMark++;
 	 				}else {
 	 					message += numbers[i] + " % : 	 Faild \n";
 	 					passMark++;

 	 				}
 				
 				while(numbers[i] < 0 || numbers[i] > 100) {
 	 	 			
 					input = JOptionPane.showInputDialog(null, "Please enter a valid Grade " + (i + 1) + ":");
 					numbers[i] = Integer.parseInt(input);
 					//message += numbers[i] + " %\n";
 	 	 		}
 			
 	 				if(numbers[i] >= passMark) {
 	 					passCount++;
 	 				}else {
 	 					failCount++;

 	 				}
 	 			
 		 	}
 			
 			message += "\n Number of Students that Passed:" + passCount ;
			message += "\n Number of students who failed: " + failCount;

 			JOptionPane.showMessageDialog(null, message);

 	}
}
