package Sample;

import javax.swing.JOptionPane;

public class W301WhileLoop {
	public static void main(String[] args) {
		String output = "";
		//1a
		int counter;
		
		//1b
		counter = 999;
		
		//2 test the variable
		while(counter < 10) {
			//3 Change the variable
			counter++;
		}//end while loop
		
		output = "final value is "  +counter;
		// display output
		JOptionPane.showMessageDialog(null, output);
		
	}

}
