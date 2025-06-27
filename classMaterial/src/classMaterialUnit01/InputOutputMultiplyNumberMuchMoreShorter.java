package classMaterialUnit01;

import javax.swing.JOptionPane;

public class InputOutputMultiplyNumberMuchMoreShorter {

	public static void main(String[] args) {
		String string1;
		String string2;
		string1 = "Please, enter a number";	
		string2 = "Which number to multiply it with?";

		string1 = JOptionPane.showInputDialog(string1);
		string2 = JOptionPane.showInputDialog(string2);
		
//		string2 = string1 + " x " + string2 + " = " + (Integer.parseInt(string1) * Integer.parseInt(string2));
		string2 = string1 + " x " + string2 + " + " + string2 + " = " + ((Integer.parseInt(string1) * Integer.parseInt(string2))+Integer.parseInt(string2));

		
		JOptionPane.showMessageDialog(null, string2);	
	}

}
