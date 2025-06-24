package Sample;

import javax.swing.JOptionPane;

public class W302ValidateInput {
	public static void main(String[] args) {
		String usersNumber, output;
		int number;
		int minNumber = 1;
		int maxNumber = 10;
		
		//prompt user for a number
		usersNumber = JOptionPane.showInputDialog("Please enter a number between " +minNumber +" and " +maxNumber);
		//convert String to int
		number = Integer.parseInt(usersNumber);
		
		while(number > maxNumber || number < minNumber) {
			//wrong number has been entered
			//prompt user for a number
			usersNumber = JOptionPane.showInputDialog("WRONG - Try again. Please enter a number between " +minNumber +" and " +maxNumber);
			//convert String to int
			number = Integer.parseInt(usersNumber);
		}
		
		//construct output
		output = "You entered " +number;
		
		// display output
		JOptionPane.showMessageDialog(null, output);
	}
}
