package Samples;

public class ternaryOperator {

	public static void main(String[] args) {
	    // declare variables
		int mark  = 66;
		int passMark = 50;
		String result;
	    
		// test to see if the mark is a pass or not
		/*if(mark >= passMark) {
			System.out.println("mark = " +mark);
	    	result = "Pass";
	    } else {
	    	result = "Fail";
	    }*/
	    
		result = (mark >= passMark) ? "Pass" : "Fail"; 
		
		//JOptionPane.showMessageDialog(null, output);
	    System.out.println(result);

	}

}