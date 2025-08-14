package dicePoker;

import java.util.Random;
import javax.swing.JOptionPane;

//this class  generates the random dice rolls for the game

public class Dice {

	private int numDice = 2; //default number off dice can be modified to give a higher number of dice
	private Random dice; // random numbers
	private int[] diceRolls; // stores the results

	public Dice() {
		dice = new Random();

	}

	public String rollDice() {
		diceRolls = new int[numDice];
		StringBuilder output = new StringBuilder();
		output.append("You Rolled:\n");

		for(int i = 0; i < numDice; i++) {
			diceRolls[i] = dice.nextInt(6) + 1; //increase to show max number of dice faces
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
