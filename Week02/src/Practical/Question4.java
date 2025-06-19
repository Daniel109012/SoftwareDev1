package Practical;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * 4.	Develop a program that will calculate the pay for children who deliver newspapers.  The pay is calculated as follows: 

		1 – 100 copies   10 pence per paper
		101 or more      15  pence per paper
		For example, if somebody delivers 105 papers then their pay would be
		(100 x 10) + (5 x 15) = 1075 pence or 10 pounds and 75 pence

		Write a program that asks for the number of papers delivered and calculates and displays the amount earned.
		 */

		String Input;
		String Output = "";
		int TPence;
		int pounds;
		int Pence;
		int Copies;
		
		Input = JOptionPane.showInputDialog("enter the amount of newspapers Copies sold");
		Copies = Integer.parseInt(Input);
		
		if(Copies <= 100) {
			TPence = Copies * 10;
			pounds = TPence / 10;
			Output = "The amount earned is " + TPence + " or " + pounds + " Pounds";
		} else {
			if(Copies > 100) {
			TPence = (Copies - 100) * 15 + (100 * 10);
			pounds = TPence / 10;
			Pence = (TPence % pounds);
			Output = "The amount earned is " + TPence + " or " + pounds + " Pounds " + Pence + " Pence";
			}
		}
		
		JOptionPane.showMessageDialog(null, Output);
		
	}

}
