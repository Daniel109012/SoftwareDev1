package practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Question05 {

	public static void main(String[] args) {
		// 5.	Write a program that simulates tossing a coin. 
		//The program should display a message to say whether the coin landed on heads or tails.

		coinFlip();
		
	}//end main
	
	public static void coinFlip() {
		
		String output = "";
		int coin;
		Random flip = new Random();
		
		for(int count = 0; count < 10; count++) {
			coin = flip.nextInt(2);
			
			if(coin == 1) {
				output = "you got Heads";
			}else {
				output = "you got Tails";
			}
			JOptionPane.showMessageDialog(null,output);
		}
		
		
	}
}//end class
