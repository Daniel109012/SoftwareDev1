package Samples;

import javax.swing.JOptionPane;

public class method04 {

	public static void main(String[] args) {
		// Accept and return a parameter
		String output;
		String ageAsString;
		int age;
		int ageNextYear;
		
		
	ageAsString = JOptionPane.showInputDialog("Enter your age ");
	age = Integer.parseInt(ageAsString);
	
	ageNextYear = addOne(age);
	
	output = "you will be " + ageNextYear + " next Year";
	JOptionPane.showMessageDialog(null, output,"Message", JOptionPane.INFORMATION_MESSAGE);

	}//end main
	
	public static int addOne(int anAge) {
		
		
		return anAge +1;
	} //end addOne

}//end class
