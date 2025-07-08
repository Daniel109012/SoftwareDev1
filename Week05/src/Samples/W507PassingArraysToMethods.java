package Samples;

import javax.swing.JOptionPane;

public class W507PassingArraysToMethods {
	  public static void main( String [] args) {
		    String output;
		    int [] array = {1, 2, 3, 4, 5};

		    // print array
		    output = "Array contents before call to method:  ";
		    for(int loop = 0; loop < array.length; loop++) {
		      output = output + array[loop] + "  ";
		    }
			//print output
			JOptionPane.showMessageDialog(null, output);
		    
		    addOneToEachElement(array);
		    
		    // print array
		    output = "Array contents after call to method:  ";
		   for(int loop = 0; loop < array.length; loop++) {
		      output = output + array[loop] + "  ";
		   }
		   //print output
		   JOptionPane.showMessageDialog(null, output);
		    
		    
	  } // end main
	  
	  public static void addOneToEachElement(int [] theArray) {
		  String output = "Insdie the method ";
		  for(int loop = 0; loop < theArray.length; loop++) {
			  theArray[loop] = theArray[loop] + 1;
		  }//end for loop
		  
		  for(int loop = 0; loop < theArray.length; loop++) {
		      output = output + theArray[loop] + "  ";
		  }
		  //print output
		  JOptionPane.showMessageDialog(null, output);
	  }//end addOneToEachElement

}//end class
