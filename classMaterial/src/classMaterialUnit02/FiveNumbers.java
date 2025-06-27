package classMaterialUnit02;

import javax.swing.JOptionPane;

public class FiveNumbers {

	public static void main(String[] args) {
		String input;
		int number;

		input = JOptionPane.showInputDialog("Please, input the 1st number");
		number = Integer.parseInt(input);
		int maxNumber = number;
		int minNumber = number;
		
		input = JOptionPane.showInputDialog("Please, input the 2nd number");
		number = Integer.parseInt(input);
		if (number > maxNumber)
			maxNumber = number;
		if (number < minNumber)
			minNumber = number;

		input = JOptionPane.showInputDialog("Please, input the 3rd number");
		number = Integer.parseInt(input);
		if (number > maxNumber)
			maxNumber = number;
		if (number < minNumber)
			minNumber = number;

		input = JOptionPane.showInputDialog("Please, input the 4th number");
		number = Integer.parseInt(input);
		if (number > maxNumber)
			maxNumber = number;
		if (number < minNumber)
			minNumber = number;

		input = JOptionPane.showInputDialog("Please, input the 5th number");
		number = Integer.parseInt(input);
		if (number > maxNumber)
			maxNumber = number;
		if (number < minNumber)
			minNumber = number;
		
		input = "The lowest number is " + minNumber + " and the largest number is " + maxNumber;
		
		JOptionPane.showMessageDialog(null, input);
	}
}
