package Practical;

import javax.swing.JOptionPane;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * 2.	Write a program to read in 5 people’s salaries and work out the tax to be paid (at 25%) for each salary.
		 * 
			Let’s say your monthly salary is BZD 4,000:

			Annual Income = 4,000 × 12 = BZD 48,000
			Taxable Income = 48,000 - 20,000 = BZD 28,000
			Income Tax = 28,000 × 0.25 = BZD 7,000
			Monthly Tax = 7,000 ÷ 12 = BZD 583.33
			So, you’d pay BZD 583.33/month in income tax.
		 */
		
		String input;
		String output = "";
		float mIncome;
		float[] Array = new float[5];
		float tax = (float)0.25;
		float relief = 20000;
		
		
		
		for(int count = 0; count < 5; count++) {
		input = JOptionPane.showInputDialog("Enter the salaries for Employees: " + (count + 1) + " \n");	
		mIncome = Float.parseFloat(input);
		Array[count] = mIncome;	
		}//end for loop
		
		output = "Tax per Salary is: \n ";
			for(int count = 0; count < 5; count++) {
				if(Array[count] <= relief) {
					output = output + Array[count] + " \n";
				}
		}
		
		JOptionPane.showMessageDialog(null, output);
		
	}// end main

}//end class
