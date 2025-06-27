package classMaterialUnit01;

import javax.swing.*;

public class InputOutputMultiplyNumber {

	public static void main(String[] args) {
		String input;
		String output;	
		String message = "Please, enter a number";		

		input = JOptionPane.showInputDialog(message);
		int number = Integer.parseInt(input);

		message = "Which number to multiply it with?";

		input = JOptionPane.showInputDialog(message);
		int multiplyWith = Integer.parseInt(input);

//		int result = number * multiplyWith;
		int result = (number * multiplyWith) + multiplyWith;
		
		output = number + " x " + multiplyWith + " + " + multiplyWith + " = " + result;   
		
		JOptionPane.showMessageDialog(null, output);
	}

}
