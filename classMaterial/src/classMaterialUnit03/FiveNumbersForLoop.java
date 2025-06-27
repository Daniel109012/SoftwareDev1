package classMaterialUnit03;

import javax.swing.JOptionPane;

public class FiveNumbersForLoop {

	public static void main(String[] args) {
		String input;
		String message;
		String temp;
		int maxNumOfNumbers = 5;
		
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		
		for (int counter = 1; counter <= maxNumOfNumbers; counter++) {
			if (counter == 1) {
				temp = "st";
			} else 
				if (counter == 2) {
					temp = "nd";
				} else
					if (counter == 3) {
						temp = "rd";
					} else
						temp = "th";
			
			message = "Please, input the " + counter + temp + " number";	// Shouldn't we introduce this variable here?
			
			input = JOptionPane.showInputDialog(message);
			int number = Integer.parseInt(input);	// Shouldn't we introduce this variable at the beginning?
			
			if (number > maxNumber)
				maxNumber = number;
			if (number < minNumber)
				minNumber = number;
		}

		message = "The lowest number is " + minNumber + " and the largest number is " + maxNumber;
	
		JOptionPane.showMessageDialog(null, message);
	}
}
