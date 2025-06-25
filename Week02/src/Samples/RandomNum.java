package Samples;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNum {

	public static void main(String[] args) {
		String output = "";
		int num;
		Random numGenerator = new Random();
		
		for(int count = 0; count < 10; count++) {
		
			num = numGenerator.nextInt(9);
		
			output = "you got a Number " + num + " \n";
		
			JOptionPane.showMessageDialog(null, output);
		
		}

	}

}
