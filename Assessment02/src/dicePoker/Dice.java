package dicePoker;

import java.util.Random;
import javax.swing.JOptionPane;

public class Dice {

	private int numDice = 2; //default number off dice
	private Random dice;
	private int[] diceRolls;

	public Dice() {
		dice = new Random();

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

		JOptionPane.showMessageDialog(null, getDiceRolls());

	}





}
