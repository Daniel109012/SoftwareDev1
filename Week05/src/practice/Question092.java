package practice;

import javax.swing.JOptionPane;

public class Question092 {

	public static void main(String[] args) {
		/*
		 * 
		 * 9.	Take the program given below and rewrite it using methods, you should use at least four methods.

		*/

		String output;
		int passes = 0;
		int fails = 0;
		int passMark = 10;
		int minMark = 0;
		int maxMark = 100;
		int numberOfStudents = 3;
		
		
		welcome();
		
		for(int student = 0; student < numberOfStudents; student++) {
			int mark = validateMark(minMark, maxMark);
			if(ifPass(mark, passMark)) {
				passes++;
			}else {
				fails++;
			}
		}
		
		output = markResult(passes, fails);
		
	}//end main
	 
	public static void welcome() {
		
		String welcomeMessage = "Hello how are you?";
		JOptionPane.showMessageDialog(null, welcomeMessage, "Hello", JOptionPane.INFORMATION_MESSAGE);
	
	}//end welcome
	
	public static int validateMark(int min, int max) {
		
		String input;
		int mark;
		
		input = JOptionPane.showInputDialog("Enter grade for student.");
		mark = Integer.parseInt(input);
		
		while (mark < min || mark > max) {
			input = JOptionPane.showInputDialog("Enter a mark between " + min + " and " + max);
			mark = Integer.parseInt(input);
			
		}
		
		return mark;
		
	}//end validateMark
	
	public static boolean ifPass(int mark, int passMark) {
		
		return mark >= passMark;
		
	}//end ifPass
	
	
	public static String markResult(int passes, int fails) {
		String output;
		
		output = "The number of passes is " +passes +"\n";
		output = output  + "The number of fails is " +fails;
		
		JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
		
		return output;
	}//end result
	

	


}//end class
