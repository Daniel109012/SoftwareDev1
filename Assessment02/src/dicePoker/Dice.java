package dicePoker;

import java.util.Random;
import javax.swing.JOptionPane;

//this class  generates the random dice rolls for the game

public class Dice {

	private int numDice = 2; //default number off dice can be modified to give a higher number of dice
	private Random dice; // random numbers
	private int[] diceRolls; // stores the results
	private int diceSides; // number of sides the dice has

	public Dice() {
		dice = new Random();
		diceSides = 6; // number of dice faces

	}

	public String rollDice() { //rolls dices and stores the results
		diceRolls = new int[numDice];
		StringBuilder output = new StringBuilder();
		output.append("You Rolled:\n");

		for(int i = 0; i < numDice; i++) {
			diceRolls[i] = dice.nextInt(diceSides) + 1; //dice sides from 1 to 6
			 output.append(" Dice ").append(i + 1).append(": ").append(diceRolls[i]).append("\n");
		}

		return output.toString();

	}

	public int[] getDiceRolls() { //get the result from the dice rolled
		return diceRolls;
	}

	public void displayDice() { //shows the dice results

		JOptionPane.showMessageDialog(null, getDiceRolls()); //displays the output

	}





}
