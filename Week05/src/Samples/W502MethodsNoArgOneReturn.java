package Samples;

import javax.swing.JOptionPane;

public class W502MethodsNoArgOneReturn {
	  public static void main(String [] args) {
		    String output = "";
		    int yourAge;
		    
		    yourAge = readAge();
		    
		    output = "You are " +yourAge;
			//print output
			JOptionPane.showMessageDialog(null, output);
		    
	 } // end main

	  //method to read in age
	  public static int readAge() {
		  String ageAsString;
		  int age;
		  
		  ageAsString = JOptionPane.showInputDialog("Please enter your age");
		  age = Integer.parseInt(ageAsString);
		  
		  return age;
	  }
	  

}//end class
