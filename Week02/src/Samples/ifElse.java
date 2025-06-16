package Samples;

import javax.swing.JOptionPane;

public class ifElse {

	public static void main(String[] args) {
		
		String input;
		
		input = JOptionPane.showInputDialog("Enter Grade");
		
		int mark;
		mark = Integer.parseInt(input);
		
		//int mark = 77;
		
		String output;
		
		if(mark >= 50) {
			output = "You have passed, well done";
		} else {
			output = "You must try harder";
		}

		JOptionPane.showMessageDialog(null, output);

	}

}
