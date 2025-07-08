package Samples;

import javax.swing.JOptionPane;

public class W504MethodsOneArgOneReturn {
	  public static void main( String [ ] args) {
		    String output = "";
		    String yourAgeString;
		    String name;
		    int yourAge, yourAgeNextYear;

		    // read in age and convert to String
		    yourAgeString = JOptionPane.showInputDialog("please enter your age");
		    yourAge = Integer.parseInt(yourAgeString);

		    //read in name
		    name = JOptionPane.showInputDialog("please enter your name");
		    
		    printDetails(name, yourAge);
		    //System.out.println(yourAge);
		    	    
	  } // end main
	  
	  public static void printDetails(String aName, int anAge)	{
		  String output;
		  //anAge = 99;
		  output = "Hi " +aName +" you are " +anAge;
		  
		  JOptionPane.showMessageDialog(null, output);
	  }//end printDetails
	  

}//end class
