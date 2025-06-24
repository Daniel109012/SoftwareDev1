package Sample;

import javax.swing.JOptionPane;

public class W308BreakAndContinue {
	public static void main(String[] args) {
		String output = "";

		for (int counter = 0; counter < 10; counter++) {
			output = output +counter +"\n";
			if(counter == 5) {
				//break;
				break;
			}//end if
		}//end for loop
		
		
		// display output
		JOptionPane.showMessageDialog(null, output);

	}

}
