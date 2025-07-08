package Practical;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * 2.	Write a program that reads in an integer then determines and prints whether it is odd or even.
		 */
		
		String Input;
		String Output;
		int Num;
		
		
		Input = JOptionPane.showInputDialog("Enter a Number");
		Num = Integer.parseInt(Input);
		
		//Using Modulus to verify the remainder
		
		if (Num % 2 == 0 ) {
			Output = Num + " Is an Even Number";
		}else {
			Output = Num + " Is an Odd Number";
		}
		
		JOptionPane.showMessageDialog(null, Output);
	}
}
