package Samples;

import javax.swing.JOptionPane;

public class W506MethodsMultArgOneReturn {
	  public static void main( String [] args) {
		    String num1String,num2String;
		    String output = "";
		    int num1, num2, total;

		    // read in num1 and convert to int
		    num1String = JOptionPane.showInputDialog("please enter an integer");
		    num1 = Integer.parseInt(num1String);

		    // read in num2 and convert to int
		    num2String = JOptionPane.showInputDialog("please enter another integer");
		    num2 = Integer.parseInt(num2String);

		    JOptionPane.showMessageDialog(null, output, "Methods", JOptionPane.INFORMATION_MESSAGE);
		    
	  } // end main
	  



}//end class
