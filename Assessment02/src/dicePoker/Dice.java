package dicePoker;

import java.util.Random;
import javax.swing.JOptionPane;

public class Dice {
	
	private static int Dice = 0;
	private Random dice;

	public Dice() {
		dice = new Random();
		
		

//		int dice1 = dice.nextInt(6) + 1;
//		int dice2 = dice.nextInt(6) + 1;
//		StringBuilder output = new StringBuilder();
//		output.append("You Rolled: ");
//		output.append(dice1 + ",  ");
//		output.append(dice2);
//		JOptionPane.showMessageDialog(null, output.toString());

	}
	
	public String NumberOfDice() {
		Dice = 0;
		String input;
		boolean validInput;
		String digitPattern = "\\d+";
		
		do{
			
			validInput = true;
			
			input = JOptionPane.showInputDialog("Enter the difficulty: \n Number of Dies form 2 to 5");
			if (input == null || input.trim().isEmpty() || !input.trim().matches(digitPattern)) {
				JOptionPane.showMessageDialog(null, "Enter the number of Dies between 2 to 5");
				validInput = false;
				continue;
			}
			
			Dice = Integer.parseInt(input); // convert string to Integer for the number of dies.
		
			if(Dice < 2 || Dice > 5) {
				JOptionPane.showMessageDialog(null, "Enter the number of Dies between 2 to 5");
				validInput = false;
			}
		
		}while(!validInput); // only accepts values between 2 and 5
		
		return rollDice(Dice);
		
	}
	
	public String rollDice(int Dice) {
		
		StringBuilder output = new StringBuilder();
		output.append("You Rolled:\n");
		
		for(int numDice = 1; numDice <= Dice; numDice++) {
			int roll = dice.nextInt(6) + 1;
			output.append(" Dice " + numDice + ": " + roll + "\n");
		}
		
		return output.toString();
		
	}
	
	public void displyDice() {
		
		String result = rollDice(Dice);
		JOptionPane.showMessageDialog(null, result.toString());
		
	}
	
		
		


}
