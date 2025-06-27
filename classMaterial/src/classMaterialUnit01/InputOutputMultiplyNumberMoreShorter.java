package classMaterialUnit01;

import javax.swing.JOptionPane;

public class InputOutputMultiplyNumberMoreShorter {

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

		number = number * Integer.parseInt(string);
		
		output = output + number;   
		
		JOptionPane.showMessageDialog(null, output);		
	}

}
