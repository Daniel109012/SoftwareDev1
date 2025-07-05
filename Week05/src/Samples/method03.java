package Samples;

import javax.swing.JOptionPane;

public class method03 {

	public static void main(String[] args) {
		// Passing one Parameter into a Method
		
		String ageAsString;
		int yourAge;
		
		ageAsString = JOptionPane.showInputDialog(" Enter your Age");
		yourAge = Integer.parseInt(ageAsString);
		
		printAge(yourAge);

	}//end main
	
	public static void printAge(int anAge) {
		
		String output;
		output = "You are " + anAge + " of age";
		
		JOptionPane.showMessageDialog(null, output, "Method03", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}// end printAge

}//end Class
