package Practical;

import javax.swing.JOptionPane;
import java.util.Random;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * 1.	Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers.
		 */
		
		String Output = "";
		int Num;
		int count = 0;
		int minNum = Integer.MAX_VALUE;
		int maxNum = Integer.MIN_VALUE;
		
		Random Numbers = new Random();
		
		
		while(count < 10) {
			Num = Numbers.nextInt(20);
			Output += Num + " \n";
			count++;	
			
			if(Num > maxNum) {
				maxNum = Num;
			}
			
			if(Num < minNum) {
				minNum = Num;	
			}
			

			
		}
		
		Output += "\nThe Largest number is: " + maxNum;
		Output += "\nThe Smallest number is: " + minNum;
			

		JOptionPane.showMessageDialog(null, Output);
		
		
		

	}

}
