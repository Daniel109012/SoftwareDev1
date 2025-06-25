package Practical;

import javax.swing.JOptionPane;
import java.util.Random;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * 1.	Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
		 */
		
		String Output;
		int Num;
		
		int maxNum;
		int minNum;
		
		Random Numbers = new Random();
		
		for(int count = 0; count < 10; count++) {
			Num = Numbers.nextInt(20);
			
			Output = "You Got " + Num + " \n";
			
			JOptionPane.showMessageDialog(null, Output);
		}
		
		
		

	}

}
