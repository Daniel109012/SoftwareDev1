package practice;

import javax.swing.JOptionPane;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * 4.	Using a class, write a method called calculateGrade() that takes a student’s mark (an integer) and returns their grade (a char).
		 *  Validate the mark entered to ensure that it is in the range 0 to 100.
		 *  Use a variable inside the method to hold the answer before returning it. 
		 *  Write a program to demonstrate your method being called from main().


			mark	grade
	
			75 - 100	A
			60 – 74		B
			50 - 59		C
			0  - 50		F
		 */
		
		String output;
		String gradeAsString;
		int studentMark;
		int maxMarkValue = 100;
		int minMarkValue = 0;
		char grade;
		
		gradeAsString = JOptionPane.showInputDialog("Enter a Student Mark to get a Grade");
		studentMark = Integer.parseInt(gradeAsString);
		
		while(studentMark < minMarkValue || studentMark > maxMarkValue) {
			gradeAsString = JOptionPane.showInputDialog("Enter a Student Mark between 0 and 100 to get a Grade");
			studentMark = Integer.parseInt(gradeAsString);
		}

		grade = calculateGrade(studentMark);
		
		output = "The student Scored a Grade of " + grade;
		JOptionPane.showMessageDialog(null, output);

		

	}//end main
	
	public static char calculateGrade(int mark) {
		


		//marks
		int maxMarkValue = 100;
		int minAMark = 75;
		int maxBMark = 74;
		int minBMark = 60;
		int maxCMark = 59;
		int minCMark = 50;
		//grades
		char grade1 = 'A';
		char grade2 = 'B';
		char grade3 = 'C';
		char grade4 = 'F';
		
		
		if(mark >= minAMark && mark <= maxMarkValue) {
			return grade1;
		}else if (mark >= minBMark && mark <= maxBMark) {
			return grade2;
		}else if (mark >= minCMark && mark <= maxCMark) {
			return grade3;
		}else {
			return grade4;
		}

		
	}//end calculate Grade

}//end class
