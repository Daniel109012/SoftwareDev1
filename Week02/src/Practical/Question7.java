package Practical;

import javax.swing.JOptionPane;

public class Question7 {

	public static void main(String[] args) {
		// 7.	 Write a program that inputs 10 student's marks. At the end, the program should print a message saying how many students have passed and how many students have failed. The pass mark is 50%.

	 	int[] numbers = new int[3];
	 	int passMark = 50;
	 	int passCount = 0;
	 	int failCount = 0;

		//String message = "The grades are: \n";

 			for (int i = 0; i < 3; i++) {
 				String input = JOptionPane.showInputDialog(null, "Enter Grades " + (i + 1) + ":");
 				numbers[i] = Integer.parseInt(input); // This line might throw NumberFormatException
 				//message += numbers[i] + " %\n";
 				
 	 	 	while(numbers[i] < 0 || numbers[i] > 100) {
 	 	 			
 	 	 		input = JOptionPane.showInputDialog(null, "Please enter a valid Grade " + (i + 1) + ":");
 	 	 		numbers[i] = Integer.parseInt(input);
 		}
 			
 	 			if(numbers[i] >= passMark) {
 	 				passMark++;
 	 				//mark = numbers[i];
 	 				// += "\n You Passed: " + mark + "%";
 	 			} else {
 	 				failCount++;
 	 				//mark = numbers[i];
 	 				//message += "\n Try Harder: " + mark + "%";
 	 			}
 	 			
 	 			
 				String message = "Number of Students that Passed:" + passCount + "\n" +
 						"Number of students who failed: " + failCount;
 				
 				JOptionPane.showMessageDialog(null, message);
 		 		}

 
		

 			/*	if (numbers[i] > maxNum) {
 					maxNum = numbers[i];
 				}
 				if (numbers[i] < minNum) {
 					minNum = numbers[i];
 				}
 			}

 			message += "\nThe largest number is: " + maxNum + "%";
 			message += "\nThe smallest number is: " + minNum + "%";

 			JOptionPane.showMessageDialog(null, message);
 			*/
 			}
	}
