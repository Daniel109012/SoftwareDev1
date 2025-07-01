package Practical;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

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
		float tax = (float).25;
		float annualIncome;
		float taxIncome;
		float incomeTax;
		float monthTax = 0;
		float totalS;
		float relief = 20000;
		
		
		
		for(int count = 0; count < Array.length; count++) {
		input = JOptionPane.showInputDialog("Enter the salaries for Employees: " + (count + 1) + " \n");	
		mIncome = Float.parseFloat(input);
		Array[count] = mIncome;	
		}//end for loop
		
		output = "Tax per Salary is: \n ";
		
			for(int count = 0; count < Array.length; count++) {
				annualIncome = Array[count] * 12;
				taxIncome = annualIncome - relief;
				incomeTax = taxIncome * tax;
				monthTax = incomeTax / 12;
				totalS = Array[count] - monthTax;
				
				if(annualIncome > relief) {
					DecimalFormat df = new DecimalFormat("0.00"); // "0.00" ensures two decimal places
					String monthTax2D = df.format(monthTax);
					output = output + (count + 1) + ": " + Array[count] + ": tax to be paid end of month is "  + monthTax2D + " \n";
				} //end if
				
				if(annualIncome < relief) {
					output = output + (count + 1) + ": " + Array[count] + ": no Tax to be colected \n";
				}//end if

			}//end for loop
		
		JOptionPane.showMessageDialog(null, output);
		
	}// end main

}//end class
