package Practical;

import javax.swing.JOptionPane;

public class Question04 {

	public static void main(String[] args) {
		
		// 4.	 Explore two-dimensional arrays
		
		/*
		 * 
		 * A two-dimensional (2D) array is like a table or grid with rows and columns. It’s an array of arrays.
		 * 
		 * keypad.length → Number of rows (4 in this case)
		 * keypad[0].length → Number of columns in the first row (3 in this case)
		 * 
		 * Fist bracket is Column Second Bracket is Row
		 */
		
		
		String output = "";
		char[][] calc = {	{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'},
							{'*','0','#'}
							};
		
		for(char[] row : calc ) {
			for(char column : row) {
				output += column + "  ";
			}
			output += "\n";

		}
		


	/*	for (int i = 0; i < calc.length; i++) {
			for (int j = 0; j < calc[i].length; j++) {
				output += calc[i][j] + "  ";
			}
			output += "\n";
		}*/

		JOptionPane.showMessageDialog(null, output);
		

	}

}
