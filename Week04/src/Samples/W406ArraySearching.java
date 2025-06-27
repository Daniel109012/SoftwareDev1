package Samples;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class W406ArraySearching {
	public static void main(String[] args) {
		String output = "";
		String keyAsString;
		int [] array = {8, 3, 2, 7, 5};
		int key, search;
		
		keyAsString  = JOptionPane.showInputDialog("Please enter a number");
		key = Integer.parseInt(keyAsString);
		
		Arrays.sort(array);
		
		search = Arrays.binarySearch(array, key);
		System.out.println(search);
		
		if(search > 0) {
			output = "key was found";
		} else {
			output = "key was not found";
		}
		
		
	    // print message
		JOptionPane.showMessageDialog(null, output);

	}//end main
}//end class
