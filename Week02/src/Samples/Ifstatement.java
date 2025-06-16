package Samples;

import javax.swing.JOptionPane;

public class Ifstatement {

	public static void main(String[] args) {
		// enter mark using If statement
		//added input to request the mark
		String input;
		String output = "";
		
		input = JOptionPane.showInputDialog("Enter Mark");
		int mark;
		mark = Integer.parseInt(input);
		//commented int mark to add above lines
		//int mark = 50;
		
		if(mark >= 50) {
			output = "You have passed";
		}
		
		JOptionPane.showMessageDialog(null, output);

	}

}
