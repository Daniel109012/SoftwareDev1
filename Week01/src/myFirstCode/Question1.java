package myFirstCode;

import javax.swing.JOptionPane;

public class Question1 {
    public static void main(String[] args) {
    	
    	/*
    	 * 1.	Write a program that will read in two integers typed at the keyboard, subtract one from the other, and then display the result.
    	 */
    	
    	String firstNum;
    	String secNum;
    	String Output;
    	int Num1;
    	int Num2;
    	int result;
    	
    	firstNum = JOptionPane.showInputDialog("Enter a Number from which to subtract");
    	secNum = JOptionPane.showInputDialog("Enter Number to subtract");
    	
    	Num1 = Integer.parseInt(firstNum); 
    	Num2 = Integer.parseInt(secNum); 
    	
    	result = Num1 - Num2;
    	
    	Output = "The Difference of " + Num1 + " and " + Num2 + " is " + result;
    	 
    	JOptionPane.showMessageDialog(null, Output, "Result",
    			JOptionPane.PLAIN_MESSAGE);
        
    }

}
