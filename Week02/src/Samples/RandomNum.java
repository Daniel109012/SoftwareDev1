package Samples;

import javax.swing.JOptionPane;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		String output;
		int num;
		
		Random numGenerator = new Random();
		num = numGenerator.nextInt(9);
		
		output = "You got a " + num;
		
		JOptionPane.showMessageDialog(null, output);
		

	}

}
