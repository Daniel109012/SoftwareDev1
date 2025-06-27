package Samples;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class W405ArraySorting {
	public static void main(String[] args) {
		String output = "";
		int [] myArray = {11, -23, 762, 4, 12};
					
		//sort array
		Arrays.sort(myArray);
		
		for(int loop = 0; loop < myArray.length; loop++) {
			output = output + myArray[loop] +" ";
		}
		
	    // print message
		JOptionPane.showMessageDialog(null, output);

		

	}//end main
}//end class
