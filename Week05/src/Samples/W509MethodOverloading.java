package Samples;

import javax.swing.JOptionPane;

public class W509MethodOverloading {
	  public static void main( String [] args) {
		    String ageString, name;
		    int age;

		    // read in name and convert to String
		    name = JOptionPane.showInputDialog("please enter your name");

		    // read in age and convert to int
		    ageString = JOptionPane.showInputDialog("please enter your age");
		    age = Integer.parseInt(ageString);
		    
		    printDetails(name);
		    printDetails(name, age);
		    printDetails(age);
		    
	  } // end main
	  
	  public static void printDetails(String aName) {
		  String output;
		  output = "Hi " +aName;
		  
		   //print output
		   JOptionPane.showMessageDialog(null, output);
	  }//end printDetails
	  
	  public static void printDetails(String aName, int age) {
		  String output;
		  output = "Hi " +aName +" you are " +age;
		  
		  //print output
		  JOptionPane.showMessageDialog(null, output);
	  }//end printDetails
	  
	  public static void printDetails(int age) {
		  String output;
		  output = "You are " +age;
		  
		  //print output
		  JOptionPane.showMessageDialog(null, output);
	  }//end printDetails
	  
	  
}//end class
