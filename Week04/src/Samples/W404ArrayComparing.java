package Samples;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class W404ArrayComparing {
	public static void main(String[] args) {
		String output = "";

		
		int [] array1 = {1, 2, 3, 4, 5, 6};
		int [] array2 = {1, 2, 3, 4, 5, 99};
		/*
		if(array1.length == array2.length) {
			for(int loop = 0; loop < array1.length; loop++) {
				if(array1[loop] == array2[loop]) {
					
				} else {
					System.out.println("Found a difference");
				}
			}	
		}else {
			System.out.println("Found a difference");
		}
		*/
	
		if(Arrays.equals(array1, array2)) {
			output = "they are equal";
		} else {
			output = "they are NOT equal";
		}

		
		// print message
		JOptionPane.showMessageDialog(null, output);



	}
}
