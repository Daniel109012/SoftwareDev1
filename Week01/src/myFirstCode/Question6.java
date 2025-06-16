package myFirstCode;

import javax.swing.JOptionPane;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * 6.	Write a program that will accept a temperature in degrees Celsius and output the equivalent in degrees Fahrenheit. 
		 * The formula for the conversion is F = (C * 9.0/5.0) + 32. You should make the variables that you use of type float.
		 */
		
		String Input;
		String Output;
		
		Input = JOptionPane.showInputDialog("Enter Degree in Celsius to convert to Fahrenheit");
		
		float Celsius;
		Celsius = Float.parseFloat(Input);
		
		float Fahrenheit;
		float div;
		div = (float) (9.0/5.0);
		Fahrenheit = (Celsius * div) + 32;
		
		Output = "The Temperature in Fahrenheit is " + Fahrenheit;
		
		JOptionPane.showMessageDialog(null, Output);
		
		

	}

}
