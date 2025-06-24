package Sample;

import javax.swing.JOptionPane;

public class W306SimpleMenu {
	public static void main(String[] args) {
		String output, usersNumber;
		int num;
		
		do {
			//contsruct output
			output = "Select one of the menu options \n\n";
			output = output + "1 - Start Program \n";
			output = output + "2 - View Details \n";
			output = output + "3 - Exit \n";
		
			//prompt user
			usersNumber = JOptionPane.showInputDialog(output);
			//convert to int
			num = Integer.parseInt(usersNumber);
			
			if(num == 1) {
				output = "Program has started";
				// display output
				JOptionPane.showMessageDialog(null, output);
			}
			
			if (num == 2) {
				output = "Here are the details";
				// display output
				JOptionPane.showMessageDialog(null, output);
			}
			
		} while(num != 3);

	}

}
