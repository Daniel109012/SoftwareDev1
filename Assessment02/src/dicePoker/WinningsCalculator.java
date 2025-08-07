package dicePoker;

import java.util.Arrays;

public class WinningsCalculator {
	
	public static int calculateWinnings(int[] rolls, int bet) {
		
		Arrays.sort(rolls);
		boolean isSequential = true;
		boolean isIdentical = true;
		
		for(int i = 1; i < rolls.length; i++) {
			if(rolls[i] != rolls[i-1]+1) {
				isSequential = false;
			}
			if(rolls[i] != rolls[i-1]) {
				isIdentical = false;
			}
		}
		

		
		if(isIdentical) {
			return bet * 3;
		}else if(isSequential) {
			return bet * 2;
		}else {
			return 0;
		}
	}

}
