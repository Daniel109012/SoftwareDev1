package practice;

import javax.swing.JOptionPane;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * 7.	Using a single class, write a method addTogether() which takes three integers adds them together and returns the result.  
		 * In the same class write a method called addTogether() which takes three doubles ands them together and returns the result.  
		 * In the same class write a method called addTogether() which takes three Strings, joins them together and returns a string.  
		 * The method signatures for each of the methods are shown below.
		 * 
		 * Demonstrate each of the methods being used.

		int addTogether(int, int, int);
		double addTogether(double, double, double);
		String addTogether(String, String, String);
		 */
		
		
		
		int num01;
		int num02;
		int num03;

		String AsString1;
		String AsString2;
		String AsString3;
		
		
		AsString1 = JOptionPane.showInputDialog("Enter and Integer");
		num01 = Integer.parseInt(AsString1);
		
		AsString2 = JOptionPane.showInputDialog("Enter and Integer");
		num02 = Integer.parseInt(AsString2);
		
		AsString3 = JOptionPane.showInputDialog("Enter and Integer");
		num03 = Integer.parseInt(AsString3);
	
		addTogether(num01, num02, num03);
		
		
		double num1, num2, num3;
	
		AsString1 = JOptionPane.showInputDialog("Enter and double");
		num1 = Double.parseDouble(AsString1);
		
		AsString2 = JOptionPane.showInputDialog("Enter and double");
		num2 = Double.parseDouble(AsString2);
		
		AsString3 = JOptionPane.showInputDialog("Enter and double");
		num3 = Double.parseDouble(AsString3);
			
		addTogether(num1, num2, num3);
		
		
		
		
		AsString1 = JOptionPane.showInputDialog("Enter and your First Name");

		AsString2 = JOptionPane.showInputDialog("Enter and Middle Name");

		AsString3 = JOptionPane.showInputDialog("Enter and Last Name");

		addTogether(AsString1, AsString2, AsString3);
		


	}//end main
	
	public static int addTogether(int num1, int num2, int num3) {
		
		int total;
		String output;
		total = num1 + num2 + num3;
		output = num1 + " + " + num2 + " + " + num3 + " = " + total;
		JOptionPane.showMessageDialog(null, output, " Question07", JOptionPane.INFORMATION_MESSAGE);
		return total;
		
		//return num1 + num2 + num3;
		
	}//end int addTogether(int, int, int)
	
	public static double addTogether(double num1, double num2, double num3) {
		
		double total;
		String output;
		total = num1 + num2 + num3;
		output = num1 + " + " + num2 + " + " + num3 + " = " + total;
		JOptionPane.showMessageDialog(null, output, " Question07", JOptionPane.INFORMATION_MESSAGE);
		return total;
		
		//return num1 + num2 + num3;
		
	}// end double addTogether(double, double, double);
	
	public static void addTogether(String word1, String word2, String word3) {
		
		String output;
		//String sentence;
		//sentence = word1  + word2  + word3;
		output = word1  + " " +  word2  + " " + word3;
		JOptionPane.showMessageDialog(null, output, " Question07", JOptionPane.INFORMATION_MESSAGE);
		
	}
	

}//end class
