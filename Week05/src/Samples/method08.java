package Samples;

import javax.swing.JOptionPane;

public class method08 {

	public static void main(String[] args) {
		// Return an array
		
		String output;
		int []usersData;
		
		//get usersData
		usersData = readUsersData();
		
		output = "Users Data: \n";
		
		for( int loop = 0; loop < usersData.length; loop++) {
			output += usersData[loop] + "  ";
		}
		
		JOptionPane.showMessageDialog(null, output, "Method07", JOptionPane.INFORMATION_MESSAGE);

	}//end main
	
	public static int [] readUsersData() {
		
		String numString;
		final int ARRAY_SIZE = 5;
		int [] theArray = new int[ARRAY_SIZE];
		
		for(int loop = 0; loop < theArray.length; loop++) {
			numString = JOptionPane.showInputDialog("Please enter and Integer");
			theArray[loop] = Integer.parseInt(numString);
					
		}//end for
		
		return theArray;	
		
	}//end readUsersData

}//end class
