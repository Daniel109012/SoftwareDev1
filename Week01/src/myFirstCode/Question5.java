package myFirstCode;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * 5.	Write a program that will read in a number, increase its value by 25% and display the result.
		 */
		
		String Input;
		String Output;

		Input = JOptionPane.showInputDialog("Enter a Number to Increase by 25%");
		
		double mult;
		mult = Double.parseDouble(Input);
		
		double Result;
		double Add;
		

		Result = mult * .25;
		Add = Result + mult;
		
		Output = "The increase of " + mult + " by 25% is " + Add;
		
		JOptionPane.showMessageDialog(null, Output, "Result",
				JOptionPane.INFORMATION_MESSAGE);
		

	}

}
