package Sample;

import javax.swing.JOptionPane;

public class W304AnotherGo {
	public static void main(String[] args) {
		
		String output;
		int anotherGo;
		
		do {
			//this is my basic program
			JOptionPane.showMessageDialog(null, "Hi there");
			
			output = "Do you want another go?";
			anotherGo = JOptionPane.showConfirmDialog(null, output, "", JOptionPane.YES_NO_OPTION);
			System.out.println(anotherGo);
		} while(anotherGo == 0);
		
		
		output = "Program exiting ... bye";
		// display output
		JOptionPane.showMessageDialog(null, output);
				
				

	}
}
