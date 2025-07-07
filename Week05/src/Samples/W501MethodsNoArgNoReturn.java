package Samples;

import javax.swing.JOptionPane;

public class W501MethodsNoArgNoReturn {
	 public static void main( String [] args) {
		 String output = "";
		 sayHello();
		 //do something else
		 //do something else
		 sayHello();
		 System.out.println(output);
	 } //end main
	 
	 
	 //user defined method
	 public static void sayHello() {
		 String output;
		 
		 output = "Hello";
		 JOptionPane.showMessageDialog(null, output);
		 
	 }//end sayHello
	 
}//end class
