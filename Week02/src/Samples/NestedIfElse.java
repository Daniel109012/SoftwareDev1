package Samples;

import javax.swing.JOptionPane;

public class NestedIfElse {

	public static void main(String[] args) {
	    // declare variables
		//int mark  = 88;
		int mark;
		int passMark = 50;
		int distLevel = 75;
		String Input;
		String output;
		
		Input = JOptionPane.showInputDialog("Enter Passing Mark");
		
		mark = Integer.parseInt(Input);
		
		if(mark >= passMark) {
			//it is a pass but we don't know what sort of pass
			if(mark >= distLevel)  {
				output = "You Did Great !Passed";
			} else {
				output = "You have Passed";
			}

		} else {
			output = "You have failed";
		}
		
		JOptionPane.showMessageDialog(null, output);

	}

}
