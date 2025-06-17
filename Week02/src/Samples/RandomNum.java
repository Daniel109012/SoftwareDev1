package Samples;

import javax.swing.JOptionPane;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		String output;
		int num;
		
		Random numGenerator = new Random();
		
		for(int count = 0; count < 10; count++) {
		num = numGenerator.nextInt(9);
		
		output = "You got a " + num;
		
		JOptionPane.showMessageDialog(null, output);
		}

	}

}
