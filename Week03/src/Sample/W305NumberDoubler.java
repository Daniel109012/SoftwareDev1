package Sample;

import javax.swing.JOptionPane;

public class W305NumberDoubler {
	public static void main(String[] args) {
		String output;
		int anotherGo;
		int number = 1;
				
		do {
			number = number * 2;//this is the number doubler
			
			output = number +"\n Do you want to double this number?";
			anotherGo = JOptionPane.showConfirmDialog(null, output, "", JOptionPane.YES_NO_OPTION);
		} while (anotherGo == 0);

		//program exits
	}

}
