package dicePoker;

import java.util.Arrays;

//	calculates how much the user earns depending on the combination of dice roll

public class Wins {
	
	public static int calculateWinnings(int[] rolls, int bet) {
		
		Arrays.sort(rolls); //sorting of dice value
		boolean isSequential = true; // is multiplied by 2 if the numbers are in sequence
		boolean isIdentical = true; // is multiplied by 3 is the numbers are the same
		
		// used to check if dice are identical or sequential otherwise its not true (false)
		for(int i = 1; i < rolls.length; i++) {
			if(rolls[i] != rolls[i-1]+1) {
				isSequential = false;
			}
			if(rolls[i] != rolls[i-1]) {
				isIdentical = false;
			}
		}
		

		
		if(isIdentical) {
			return bet * 3; //multiplies bet amount by 3
		}else if(isSequential) {
			return bet * 2; //multiplies bet amount by 2
		}else {
			return 0;
		}
	}

}
