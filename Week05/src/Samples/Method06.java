package Samples;

import javax.swing.*;

public class Method06 {

	public static void main(String[] args) {
		// Multiple parameters and returns a value
		String num1AsString;
		String num2AsString;
		String output;
		int number1;
		int number2;
		int total;
		
		//read number1 and convert to int
		
		num1AsString = JOptionPane.showInputDialog("Please enter an Integer");
		number1 = Integer.parseInt(num1AsString);
		
		//read number2 and convert to an int
		
		num2AsString = JOptionPane.showInputDialog("Please enter an Integer");
		number2 = Integer.parseInt(num2AsString);
		
		total = add(number1, number2);
		
		output = number1 + " + " + number2 + " = " + total;
		JOptionPane.showMessageDialog(null, output, "Method06", JOptionPane.INFORMATION_MESSAGE);

	} //end main
	
	public static int add(int num1,int num2) {
		return num1 + num2;
		
	}//end add

}// end class
