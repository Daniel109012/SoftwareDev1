package dicePoker;

import java.util.Random;
import javax.swing.JOptionPane;

public class Dice {

	private int numDice = 2;
	private Random dice;
	private int[] diceRolls;

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

	public void askNumberOfDice() {
		String input;
		boolean validInput;
		String digitPattern = "\\d+";

		do{

			validInput = true;

			input = JOptionPane.showInputDialog("Enter the difficulty: \n Number of Dice form 2 to 5");
			if (input == null || input.trim().isEmpty() || !input.trim().matches(digitPattern)) {
				JOptionPane.showMessageDialog(null, "Enter the number of Dice between 2 to 5");
				validInput = false;
				continue;
			}

			int diceInput = Integer.parseInt(input); // convert string to Integer for the number of dies.

			if(diceInput < 2 || diceInput > 5) {
				JOptionPane.showMessageDialog(null, "Enter the number of Dice between 2 to 5");
				validInput = false;
			}else {
				numDice = diceInput;
			}

		}while(!validInput); // only accepts values between 2 and 5



	}

	public String rollDice() {
		diceRolls = new int[numDice];
		StringBuilder output = new StringBuilder();
		output.append("You Rolled:\n");

		for(int i = 0; i < numDice; i++) {
			diceRolls[i] = dice.nextInt(6) + 1;
			 output.append(" Dice ").append(i + 1).append(": ").append(diceRolls[i]).append("\n");
		}

		return output.toString();

	}

	public int[] getDiceRolls() {
		return diceRolls;
	}

	public void displayDice() {

		JOptionPane.showMessageDialog(null, rollDice());

	}





}
