package myFirstCode;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * 2.	Write a program that will read in an integer, divide it by two, and display the result.
		 */
		
    	String firstNum;
    	String secNum;
    	String Output;
    	int Num1;
    	int Num2;
    	int result;
    	
    	firstNum = JOptionPane.showInputDialog("Enter a Number from which to Divide");
    	secNum = JOptionPane.showInputDialog("Enter Number that will Devide the first Number");
    	
    	Num1 = Integer.parseInt(firstNum); 
    	Num2 = Integer.parseInt(secNum); 
    	
    	result = Num1 / Num2;
    	
    	Output = "The Result of " + Num1 + " Divided by " + Num2 + " is " + result;
    	 
    	JOptionPane.showMessageDialog(null, Output, "Result",
    			JOptionPane.INFORMATION_MESSAGE);

	}

}
