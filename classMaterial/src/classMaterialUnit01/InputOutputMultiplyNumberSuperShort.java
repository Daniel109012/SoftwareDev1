package classMaterialUnit01;

import javax.swing.JOptionPane;

public class InputOutputMultiplyNumberSuperShort {

	public static void main(String[] args) {	
		JOptionPane.showMessageDialog(null, Integer.parseInt(JOptionPane.showInputDialog("Please, enter a number")) * 
				Integer.parseInt(JOptionPane.showInputDialog("Which number to multiply it with?")));		
	}

}
