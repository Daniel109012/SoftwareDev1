package Practical;

import javax.swing.JOptionPane;


public class Question1 {

	public static void main(String[] args) {
		/*1.	Write a program that reads in two integers from the keyboard and displays: 
		•		the value of them added together 
		•		the value of them multiplied together. 
		The program should also print a message saying which of the numbers is the largest. Make sure that your program can handle the numbers if they are equal.
		 */
		
		String Input1;
		String Input2;
		String Output1;
		int Num1;
		int Num2;
		int add;
		int mult;
		
		Input1 = JOptionPane.showInputDialog("Enter a Numbers to Add and Multiply");
		Input2 = JOptionPane.showInputDialog("Enter the Second Number");
		
		Num1 = Integer.parseInt(Input1);
		Num2 = Integer.parseInt(Input2);
		
		add = Num1 + Num2;
		mult = Num1 * Num2;
		
		//Output1 = "%"+"The sum of " + Num1 + " and " + Num2 + " is " + add + "\n and" + " the Multiplication of the 2 numbers is " + mult + "%";
		
		if (mult == add){
			Output1 = "The Answers are the same";
		} else {
			if (mult > add){
				Output1 = "The sum of " + Num1 + " and " + Num2 + " is " + add + "\n and" + " the Multiplication of the 2 numbers is " + mult + "\n The Multiplication is Greater that the Addintion";
			}else {
				Output1 = "The sum of " + Num1 + " and " + Num2 + " is " + add + "\n and" + " the Multiplication of the 2 numbers is " + mult + "\n The Addition is Greater that the Multiplication";
			}
		}
		
		JOptionPane.showMessageDialog(null, Output1); 

	}

}
