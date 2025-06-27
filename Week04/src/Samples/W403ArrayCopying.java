package Samples;

import javax.swing.JOptionPane;
import java.util.Arrays;
@SuppressWarnings("unused")

public class W403ArrayCopying {
	public static void main(String[] args) {
		String output;
		int [] array1 = {1, 2, 3, 4, 5, 6};
		int [] array2 = new int[array1.length];
		
		//copy array
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		//increment array1
		for(int loop = 0; loop < array1.length; loop++) {
			array1[loop] = array1[loop] + 1;
		}
		
		//modify array2
		for(int loop = 0; loop < array2.length; loop++) {
			array2[loop] = array2[loop] + 99;
		}

		//create output for array 1
		output = "Array1:    ";
		for(int loop = 0; loop < array1.length; loop++) {
			output = output +array1[loop] + "  ";
		}
		
		// print message
		JOptionPane.showMessageDialog(null, output);
	
		//create output for array 2
		output = "Array2:    ";
		for(int loop = 0; loop < array2.length; loop++) {
			output = output +array2[loop] + "  ";
		}
		
		// print message
		JOptionPane.showMessageDialog(null, output);
	
	    
	}//end main
}//end class
