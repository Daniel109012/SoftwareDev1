package Samples;

import javax.swing.JOptionPane;

public class method07 {

	public static void main(String[] args) {
		// Passing an array to a method
		
		String output;
		int [] array = {1, 2, 3, 4, 5, 6};
		
		//print array
		output = "Array content before call to Method \n";
		for(int loop = 0; loop < array.length; loop++) {
			output = output + array[loop] + "\n";
			
		}//end for
		JOptionPane.showMessageDialog(null,output,"Method07",JOptionPane.INFORMATION_MESSAGE);
		
		addOneToEachElement(array);
		
		//print array + 1
		output = "Array content before call to Method \n";
		for(int loop = 0; loop < array.length; loop++) {
			output = output + array[loop] + "\n";
			
		}//end for
		JOptionPane.showMessageDialog(null,output,"Method07",JOptionPane.INFORMATION_MESSAGE);
		
		
	}//end main
	
	public static void addOneToEachElement(int [] anArray) {
		for(int loop = 0; loop < anArray.length; loop++) {
			anArray[loop] = anArray[loop] + 1;
		}
	}

}//end class
