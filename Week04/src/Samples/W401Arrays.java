package Samples;

import javax.swing.JOptionPane;

public class W401Arrays {
	public static void main(String[] args) {
		String output = "";
		String aNum;
		int num;
		
		//create array
		final int ARRAY_SIZE = 5;
		int [] usersNumbers = new int[ARRAY_SIZE];
		
		//loop 5 times
		for(int counter = 0; counter < usersNumbers.length; counter++) {
			aNum = JOptionPane.showInputDialog("please enter a number");
			num = Integer.parseInt(aNum);
			usersNumbers[counter] = num;	
		}//end for loop
		
		//loop to create the display
		output = "You entered ";
		for(int counter = 0; counter < usersNumbers.length; counter++) {
			output = output + usersNumbers[counter] +" ";
		}
		
		//print output
		JOptionPane.showMessageDialog(null, output);

	}//end main
}//end class
