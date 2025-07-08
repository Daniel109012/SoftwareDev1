package practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * 6.	Modify your solution to the above question so that it tosses the coin 1000 times. 
		 * Count the number of times each side of the coin appears and print the results. 
		 * You shouldn’t print the result of each individual toss of the coin, 
		 * you only need to print the total number of heads and the total number of tails.
		 */

		coinFlip();
		
	}//end main
	
	public static void coinFlip() {
		
		String output = "";
		int coin;
		int headsCount = 0;
		int tailsCount = 0;
		Random flip = new Random();
		
		
		for(int count = 0; count < 1000; count++) {
			coin = flip.nextInt(2);
			
			
			if(coin == 1) {
				headsCount++;
			}else {
				tailsCount++;
			}
			
		}

		output = output + "\n number of Heads Count " + headsCount;
		output = output + "\n number of Tails Count " + tailsCount;
		
		JOptionPane.showMessageDialog(null,output);
		
		
	}
}//end class