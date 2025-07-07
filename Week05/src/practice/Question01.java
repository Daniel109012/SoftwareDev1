package practice;

import javax.swing.JOptionPane;

public class Question01 {

	public static void main(String[] args) {
/*
 * 1.	Using a class, write a method called welcome() that takes no arguments but prints a welcome message on the screen. Write a program to demonstrate your method being called from main().
 */
		//call from method welcome()
		welcome();
		
	}//end main
	
	public static void welcome() {
		String output;
		output = "Welcome";
		JOptionPane.showMessageDialog(null, output, "Question01", JOptionPane.INFORMATION_MESSAGE);
		
	}//end method welcome()
	

}//end class
