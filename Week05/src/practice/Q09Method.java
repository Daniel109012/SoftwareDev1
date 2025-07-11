package practice;

import javax.swing.JOptionPane;

public class Q09Method {

	//Welcome Message
	public static String welcomeMessage(String welcomeMessage) {
		//input Message
		welcomeMessage = "Hello how are you? \n Welcome to student Mark"
				+ ""
				+ "";
		//output Message
		JOptionPane.showMessageDialog(null, welcomeMessage, "Hello", JOptionPane.INFORMATION_MESSAGE);
		
		return welcomeMessage ;
	}
	
	public static int studentMark(int mark) {
		

			String markAsString = JOptionPane.showInputDialog("Enter the student mark");
			mark = Integer.parseInt(markAsString);

		return mark ;
	}
	
	public static int validateMark(int mark) {
		int minMark = 0;
		int maxMark = 100;
		
		String markAsString = "Please enter a mark between " +minMark +" and " +maxMark;
					String	message = JOptionPane.showInputDialog(markAsString);
			   	   	 mark = Integer.parseInt(message);
			   	   	 
			   	   	 return mark;
		
	}
	
	public static String result(int passes, int fails ) {
		String output;

		
		output = "The number of passes is " +passes +"\n";
		output = output  + "The number of fails is " +fails;
		
		JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
		return output;
		
	}
	
	
	
	

	

}//end class
