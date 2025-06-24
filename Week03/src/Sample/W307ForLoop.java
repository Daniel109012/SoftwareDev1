package Sample;

import javax.swing.JOptionPane;

public class W307ForLoop {
	public static void main(String[] args) {

		String output = "";
		int counter;

		for(counter = 0; counter < 10; counter++) {
			System.out.println(counter);
		}//end for loop
		
		output = "Counter = " +counter;
		// display output
		JOptionPane.showMessageDialog(null, output);
	}

}
