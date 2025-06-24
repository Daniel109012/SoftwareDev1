package Sample;

import javax.swing.JOptionPane;

public class W303doWhileLoop {
	public static void main(String[] args) {
		String output = "";
		int counter = 999;
		
		do {
			counter++;
		} while(counter < 10);
		
		output = "Counter = " +counter;
		
		// display output
		JOptionPane.showMessageDialog(null, output);
		
		
		
	}

}
