package dicePoker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class DicePokerGame {
	
	private static final int MAX_ROUNDS = 5;
	private static final int STARTING_BANK = 6;
	
	private int bank = STARTING_BANK;
	private int round = 0;
	
	private Dice dice;
	private List<Round> rounds;
	
	public DicePokerGame() {
		dice = new Dice();
		rounds = new ArrayList<>();
		
	}//End Method DicePokerGame
	
	public void start() {
		dice.askNumberOfDice();
		
		while (bank > 0 && round < MAX_ROUNDS) {
			int bet = getBetAmount();
			String rollMsg = dice.rollDice();
			int[] diceRolls = dice.getDiceRolls();
			int winnings = WinningsCalculator.calculateWinnings(diceRolls, bet);
			
			Round gameRound = new Round(++round, bet, diceRolls, winnings);
			rounds.add(gameRound);
			bank += gameRound.getNetChange();
			
			JOptionPane.showMessageDialog(null, rollMsg + "\n" + gameRound.getSummary());
		}
		
		showFinalSummary();
	}//end Method start
	
	private int getBetAmount() {
		int bet = 1;
		boolean valid = false;
		
		do {
			String input = JOptionPane.showInputDialog("Round " + (round + 1) + ": You have $" + bank + ". Enter your bet (1-4):");
			if (input == null || input.isBlank() || !input.matches("\\d+")) continue;
			bet = Integer.parseInt(input);
			if(bet < 1 || bet > 4) continue;
			if (bet > bank) {
				JOptionPane.showMessageDialog(null, "You do not have Suficient to Bet");
				continue;
			}
			valid = true;
		}while(!valid);
		
		return bet;
	}
	
	private void showFinalSummary() {
		StringBuilder output = new StringBuilder("Game Over!\n\n");
		
		for(Round r : rounds) {
			output.append(r.getSummary()).append("\n");
		}
	
	output.append("\nFinal Bank: $").append(bank).append("\n");
	if(bank <= 0) output.append("You Ran out of Money.");
	else if (round >= MAX_ROUNDS) output.append("You have reached the max number of rounds");
	
	JOptionPane.showMessageDialog(null, output.toString());
	
}

}//End Class DicePokerGame
