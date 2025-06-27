package Samples;

import javax.swing.JOptionPane;

public class W402ArrayReferences {
	public static void main(String[] args) {
	    String output = "";
	    int [] array1;
	    int [] array2 = {1, 2, 3, 4, 5, 6};
	   
	    //this does not copy array2 into array 1
	    array1 = array2;

	    for(int loop = 0; loop < array1.length; loop++) {
	    	array1[loop] = array1[loop] +99;
	    }
	    
	    output = "Array 2 - ";
		for(int loop = 0; loop < array2.length; loop++) {
			output = output +array2[loop] +" ";
		}
		// print message
		JOptionPane.showMessageDialog(null, output);

		output = "Array 1 - ";
		for(int loop = 0; loop < array1.length; loop++) {
			output = output +array1[loop] +" ";
		}
		// print message
		JOptionPane.showMessageDialog(null, output);

		
	}

}
