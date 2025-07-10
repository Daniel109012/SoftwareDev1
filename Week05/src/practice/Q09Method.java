package practice;

import javax.swing.JOptionPane;

public class Q09Method {

	//Welcome Message
	public static String welcomeMessage(String welcomeMessage) {
		//input Message
		welcomeMessage = "Hello how are you?";
		//output Message
		JOptionPane.showMessageDialog(null, welcomeMessage, "Hello", JOptionPane.INFORMATION_MESSAGE);
		
		return welcomeMessage ;
	}
	
	public static int validatePass(int passes, int fails) {
		
		int studentNum = 3;
		for(int student = 0; student < studentNum; student++) {
			String markAsString = JOptionPane.showInputDialog("Enter the student mark");
			int mark = Integer.parseInt(markAsString);
			
			while(mark < 0 || mark > 100) {
				markAsString = JOptionPane.showInputDialog("Enter the student mark fro 0 to 100");
				mark = Integer.parseInt(markAsString);
			}
			
			if(mark >= 10) {
				passes++;
			}else{
				fails++;
			}
		
		}
		
		return studentNum ;
	}
	
	public static String markResult() {
		
		
		int passes = 0;
		int fails = 0;
		String output;
		
		Q09Method.validatePass(passes, fails);
		
		output = "The number of passes is " +passes +"\n";
		output = output  + "The number of fails is " +fails;
		JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
		return output;

	}
	
	

	

}//end class
