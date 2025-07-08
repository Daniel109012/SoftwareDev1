package Samples;

import javax.swing.JOptionPane;

public class W508MethodsThatReturnArrays {
	  public static void main( String [] args) {
		    String output;
		    int [] usersData;

		    // get users data
		    usersData = readUsersData();

		    // print array
		    output = "Users Data:  ";
		    for(int loop = 0; loop < usersData.length; loop++) {
		      output = output + usersData[loop] + " ";
		    }
		    JOptionPane.showMessageDialog(null, output, "Arrays", JOptionPane.INFORMATION_MESSAGE);

	  } // end main

	  // user defined method
	  public static int [] readUsersData() {
		    String num1String;
		    final int ARRAY_SIZE = 5;
		    int [] tempArray = new int[ARRAY_SIZE];
		    for(int loop = 0; loop < tempArray.length; loop++) {
		      // read in num1 and convert to integer
		      num1String = JOptionPane.showInputDialog("please enter an integer");
		      tempArray[loop] = Integer.parseInt(num1String);
		    }
		    return tempArray;
	  } // end readUserData()

}
