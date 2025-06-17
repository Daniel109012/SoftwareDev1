package Samples;

import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		String output = "";
		int counter = 0;
		
		while(counter <= 10) {
			
			output = output + counter + "\n";
			counter++;
		}
		

		JOptionPane.showMessageDialog(null, output);
		
	}

}


/*public static void main(String[] args) {
	String output = "";
	int counter = 0;
	
	while(counter <= 10) {
		counter  = counter +1;
		System.out.println("counter = " +counter);
	}
	
	output = "The counter is " +counter;
	// display output
	JOptionPane.showMessageDialog(null, output);
	
	
}

}
*/