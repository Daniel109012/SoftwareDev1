package Samples;

import javax.swing.JOptionPane;

public class W503MethodsOneArgNoReturn {
	  public static void main( String [] args) {
		    String yourAgeString;
		    String output;
		    int yourAge, ageNextBirthday;

		    // read in age
		    yourAgeString = JOptionPane.showInputDialog("please enter your age");
		    // convert String to int
		    yourAge = Integer.parseInt(yourAgeString);
		    
		    ageNextBirthday = addOne(yourAge);
		    
		    output = "You will soon be " +ageNextBirthday;
		    print(output);
		    
	} // end main
	  
	 public static int addOne(int anAge) {
		 /*
		 int agePlusOne;
		 agePlusOne = anAge + 1;
		 
		 return agePlusOne;
		 */
		 return anAge + 1;
	 }//end addOn
	 
	 public static void print(String output) {
		 JOptionPane.showMessageDialog(null, output);
	 }//end print
	 
}//end class
