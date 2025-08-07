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
		boolean playAgain = false;
		
		do {
			restart();
			endGame();
			
//			int option = JOptionPane.showConfirmDialog(null, "Your Bank balance is $" + bank + ".\n Would you want to bet again?",
//					"Continue?",
//					JOptionPane.YES_NO_OPTION);
//			playAgain = (option == JOptionPane.YES_OPTION);

		}while (playAgain);

	}//end Method start
	
	private void restart(){
		bank = STARTING_BANK;
		round = 0;
		rounds.clear();
	}
	
	private void endGame() {
		
		boolean anotherBet = true;

		while (bank > 0 && round < MAX_ROUNDS && anotherBet) {
			int bet = getBetAmount();
			String rollMsg = dice.rollDice();
			int[] diceRolls = dice.getDiceRolls();
			int winnings = WinningsCalculator.calculateWinnings(diceRolls, bet);

			Round gameRound = new Round(++round, bet, diceRolls, winnings);
			rounds.add(gameRound);
			bank += gameRound.getNetChange();

			JOptionPane.showMessageDialog(null, rollMsg + "\n" + gameRound.getSummary());
			
//			if(bank > 0 && round < MAX_ROUNDS) {
//				int option = JOptionPane.showConfirmDialog(null, "Your Bank balance is $" + bank + ".\n Would you want to bet again?",
//						"Continue?",
//						JOptionPane.YES_NO_OPTION);
//				anotherBet = (option == JOptionPane.YES_OPTION);
//			}

		}
	    showFinalSummary();

	}
	

	private int getBetAmount() {
		int bet = 1;
		boolean valid = false;

		do {
			String input = JOptionPane.showInputDialog("Round " + (round + 1) + ": You have $" + bank + ". Enter your bet (1-" + bank + "):");
			if (input == null) {

				int confirmExit = JOptionPane.showConfirmDialog(
						null,
						"Are you sure you want to exit the game?",
						"Exit Game",
						JOptionPane.YES_NO_OPTION
						);

				if (confirmExit == JOptionPane.YES_OPTION) {
					showFinalSummary();//show results so far
					System.exit(0);//exit
				}else{
					continue;//stay in game
				}
			}

			if( input.isBlank() || !input.matches("\\d+")) continue;
			bet = Integer.parseInt(input);
			if(bet < 1 || bet > bank) continue;
			if (bet > bank) {
				JOptionPane.showMessageDialog(null, "You do not have Suficient to Bet");
				continue;
			}
			valid = true;
		}while(!valid);

		return bet;

	}//end getBetAmount

	private void showFinalSummary() {
		StringBuilder output = new StringBuilder("Game Over!\n\n");
		for(Round r : rounds) {
			output.append(r.getSummary()).append("\n");
		}
		

		output.append("\nFinal Bank: $").append(bank).append("\n");
		if(bank <= 0) output.append("You Ran out of Money.");
		else if (round >= MAX_ROUNDS) output.append("You have reached the max number of rounds");

		JOptionPane.showMessageDialog(null, output.toString());

	}//end showFinalSummary

}//End Class DicePokerGame
