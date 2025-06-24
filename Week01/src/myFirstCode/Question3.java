package myFirstCode;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * 3.	Write a program that will read in a real number (i.e. one with a decimal point), divide it by two and display the result.
		 */
		
		String Div;
		String Output;
		
		Div = JOptionPane.showInputDialog("Enter a Number with a decimal point");
		
		double number;
		number = Double.parseDouble(Div);
		
		double result;
		result = number / 2;
		//should add a % formula to get remainder
		
		Output = "The result of " + number + "divided by 2 is " + result;
		
		JOptionPane.showMessageDialog(null, Output, "Result",
				JOptionPane.INFORMATION_MESSAGE);
		

	}

}
