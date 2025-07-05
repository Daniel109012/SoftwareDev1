package Samples;

import javax.swing.JOptionPane;

public class method01 {

	public static void main(String[] args) {
		//no parameters and no return value
		// Calls Method printWelcomeMessage
		printWelcomeMessage();

	}//end main
	
	public static void printWelcomeMessage() {
		String output;
		
		output = "Welcome to my Program ....";
		
		//print message
		JOptionPane.showMessageDialog(null, output, "Method01", JOptionPane.INFORMATION_MESSAGE);
	}//end printWelcomeMessage

}//end class
