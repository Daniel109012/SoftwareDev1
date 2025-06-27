package classMaterialUnit01;

import javax.swing.JOptionPane;

public class InputOutputMultiplyNumberBitShorter {

	public static void main(String[] args) {
		String string;
		String output;
		string = "Please, enter a number";		

		string = JOptionPane.showInputDialog(string);
		output = string + " x ";
		int number = Integer.parseInt(string);

		string = "Which number to multiply it with?";
		string = JOptionPane.showInputDialog(string);
		output = output + string + " = ";
		int multiplyWith = Integer.parseInt(string);

		number = number * multiplyWith;
		
		output = output + number;   
		
		JOptionPane.showMessageDialog(null, output);		
	}

}
