package Samples;

import javax.swing.JOptionPane;

public class W505MethodsMultArgNoReturn {
	  public static void main( String [] args) {
		    String yourAgeString, name;
		    int yourAge;

		    // read in age and convert to String
		    yourAgeString = JOptionPane.showInputDialog("please enter your age");
		    yourAge = Integer.parseInt(yourAgeString);
		    // read in name
		    name = JOptionPane.showInputDialog("please enter your name");


	  } // end main




}//end class
