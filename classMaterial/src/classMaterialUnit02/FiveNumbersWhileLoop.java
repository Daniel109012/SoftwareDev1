package classMaterialUnit02;

import javax.swing.*;

public class FiveNumbersWhileLoop {

	public static void main(String[] args) {
		String input;
		String message;
		String temp = "";
		int counter = 0;
		int maxNumOfNumbers = 5;
		
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		
		while (counter < maxNumOfNumbers) {
			counter = counter + 1;

//		if (counter == 1) {
//			temp = "st";
//		} else 
//			if (counter == 2) {
//				temp = "nd";
//			} else
//				if (counter == 3) {
//					temp = "rd";
//				} else
//					if (counter > 3)	
//						temp = "th";

			if (counter == 1) {
				temp = "st";
			} 
			if (counter == 2) {
				temp = "nd";
			} 
			if (counter == 3) {
				temp = "rd";
			}
			if (counter > 3) {	
				temp = "th";
			}
			
			message = "Please, input the " + counter + temp + " number";	// Shouldn't we introduce this variable here?
			
			input = JOptionPane.showInputDialog(message);
			int number = Integer.parseInt(input);	// Shouldn't we introduce this variable at the beginning?
			
			if (number > maxNumber)
				maxNumber = number;
			else
				if (number < minNumber)
					minNumber = number;
		}

		message = "The lowest number is " + minNumber + " and the largest number is " + maxNumber;
	
		JOptionPane.showMessageDialog(null, message);
	}

}
