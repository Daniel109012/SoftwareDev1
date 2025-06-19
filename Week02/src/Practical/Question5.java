package Practical;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * 5.	Extend your solution to the previous question to calculate the pay as follows.  
		1 – 100 copies      10 pence per paper
		101  - 150 copies 15  pence per paper 
		151	 more         20 pence per paper
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
			if(Copies <= 150) {
			TPence = (Copies - 100) * 15 + (100 * 10);
			pounds = TPence / 10;
			Pence = (TPence % pounds);
			Output = "The amount earned is " + TPence + " or " + pounds + " Pounds " + Pence + " Pence";
			}else {
				TPence = (Copies - 150) * 20 + (50 * 15) + (100 * 10);
				pounds = TPence / 10;
				Pence = (TPence % pounds);
				Output = "The amount earned is " + TPence + " or " + pounds + " Pounds " + Pence + " Pence";
			}
		}
		
		JOptionPane.showMessageDialog(null, Output);
		
	}

}