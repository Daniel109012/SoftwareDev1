package Sample;

import javax.swing.JOptionPane;

public class W309SwitchStatement {
	public static void main(String[] args) {
		String usersGrade;
		String output = "";
		char grade;
		
		usersGrade = JOptionPane.showInputDialog("Please enter your grade (a - f)");
		grade = usersGrade.charAt(0);
		
		switch (grade) {
			case 'a':
			case 'A' :
				output = "fantastic result";
				break;
			case 'b' :
				output = "great result";
				break;
			case 'c' :
				output = "very good";
				break;
			case 'd' :
				output = "must do better";
				break;
			case 'e' :
				output = "poor";
				break;
			case 'f' :
				output = "fail";
				break;
			default:
				output = "I didn't recognise your entry";
		}
		
		// display output
		JOptionPane.showMessageDialog(null, output);

		
		
		
		
		

	}

}
