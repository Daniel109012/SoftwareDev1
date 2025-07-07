package practice;

public class Question09 {

	public static void main(String[] args) {
		/*
		 * 
		 * 9.	Take the program given below and rewrite it using methods, you should use at least four methods.

import javax.swing.JOptionPane;
public class Question5 {
	public static void main(String[] args) {
		//declare variables
		String theMark;
		int mark;
		String output;
		int passes, fails;
		int student;
		String message;
		String welcomeMessage = "Hello how are you?";
		
		JOptionPane.showMessageDialog(null, welcomeMessage, "Hello", JOptionPane.INFORMATION_MESSAGE);
		
		//initialise
		student = 1;
		passes = 0;
		fails = 0;
		int numberOfStudents = 3;
		int passMark = 10;
		int minMark = 0;
		int maxMark = 100;
	
		
		//main loop to read in marks      
		
		do {
			//read in marks
			message = "please enter a mark";
			theMark = JOptionPane.showInputDialog(message);
	   	   	mark = Integer.parseInt(theMark);

	   	   	//validate mark
	   	   	while (mark < minMark || mark  > maxMark) {
		   	 	message = "Please enter a mark between " +minMark +" and " +maxMark;
				theMark = JOptionPane.showInputDialog(message);
		   	   	mark = Integer.parseInt(theMark);
		   	}
	   	   	  
		   	  //check if mark is a pass or fail
		   	  if (mark >= passMark) {
		   		  passes++;
		   	  }
		   	  else {
		   		  fails++;
		   	  }
		   	  //increment counter
		   	student++;
		}while(student <= numberOfStudents); 
  
		// construct output
		output = "The number of passes is " +passes +"\n";
		output = output  + "The number of fails is " +fails;
		JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main

}//end class
		 */
		
		
	}

}
