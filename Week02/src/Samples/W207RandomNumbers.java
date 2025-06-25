package Samples;

import javax.swing.JOptionPane;
import java.util.Random;

public class W207RandomNumbers {
	public static void main(String[] args) {
		String output;
		int num;
		Random numGenerator = new Random();  //don't worry about that
		
		int counter = 0;
		int totalNumberOfRandomIntegers = 10;
		int range = 6;
		
		while(counter < totalNumberOfRandomIntegers) {
			num = numGenerator.nextInt(range) + 1;
			System.out.println(num);
			counter++;
		}
		
		

	}

}
