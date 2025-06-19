package Practical;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * 3.	Write a program that will test whether a character entered is a vowel or not and will display an appropriate message as a result.  
		 * Here is the start of the program up to reading in and converting to a character, after that you need to test if it is a vowel or not.
		 */
		
		String Input;
		String Output;
		char Vowel;
		char Letter;
		
		Input = JOptionPane.showInputDialog("Enter a Letter to verify Vowel");		
		Letter = Input.charAt(0);
		
		if(Letter == 'a'|| Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u'
				|| Letter == 'A'|| Letter == 'E' || Letter == 'I' || Letter == 'O' || Letter == 'U') {
			Output = "The Letter Entered is a Vowel!";
		}else {
			Output = "the Letter entered is a Consonant!";
		}
		
		JOptionPane.showMessageDialog(null,Output);
	}

}
