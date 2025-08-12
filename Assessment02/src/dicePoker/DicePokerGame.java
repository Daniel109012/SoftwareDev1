package dicePoker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DicePokerGame {

	private static final int MAX_BETS = 5;
	private static final int STARTING_BANK = 6;
	private static List<ScoreEntry> highScore = new ArrayList<ScoreEntry>();
	private List<Bets> rounds;
	private int bank = STARTING_BANK;
	private int bets = 0;
	private Dice dice;
	private String playerName;
	
	
	//==================================================================================================\\

	public DicePokerGame() {
		dice = new Dice();
		rounds = new ArrayList<>();

	}//End Method DicePokerGame
	
	//==================================================================================================\\

	public void start() {
		boolean playAgain;
		
		playerName = JOptionPane.showInputDialog("Enter Your Name");

		do {
			restart();
			betRounds();

			int option = JOptionPane.showConfirmDialog(null, " Would you want to restart the game?",
					"Continue?",
					JOptionPane.YES_NO_OPTION);
			playAgain = (option == JOptionPane.YES_OPTION);

		}while (playAgain);

	}//end Method start

	private void restart(){
		bank = STARTING_BANK;
		bets = 0;
		rounds.clear();
	}
	
	//==================================================================================================\\

	private void betRounds() {

		boolean anotherBet = true;

		while (bank > 1 && bets < MAX_BETS && anotherBet) {
			int bet = getBetAmount();
			String rollMsg = dice.rollDice();
			int[] diceRolls = dice.getDiceRolls();
			int winnings = WinningsCalculator.calculateWinnings(diceRolls, bet);


			Bets gameRound = new Bets(++bets, diceRolls, bet, winnings);
			rounds.add(gameRound);
			bank += gameRound.getNetChange();

			JOptionPane.showMessageDialog(null, /*rollMsg +*/ "\n" + gameRound.getSummary());

		}
		Results();//result method

	}

	//==================================================================================================\\
	
	private int getBetAmount() {
		int bet = 1;
		int maxBet;
		boolean valid = false;
		
		


		while (!valid) {
			JTextField betButton = new JTextField();
			

			//add code for bank less than 4
			if(bank == 1) {
				maxBet = 1;
			}else if(bank >= 4) 
			{maxBet = 4;}
			else{maxBet = bank - 1;}
			
			Object[] gameMessage  = {
					"Round " + (bets + 1) + ":\nYou have $" + bank + ". The bet costs 1$. Enter your Bet (1$ to " + maxBet + "$):",betButton
			};
			

			Object[] buttons = {"Bet", "Quit"};

			int option = JOptionPane.showOptionDialog(
					null,
					gameMessage,
					"Place Your Bet",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null,
					buttons,
					buttons[0]
					);


			if (option == JOptionPane.NO_OPTION || option == JOptionPane.CLOSED_OPTION) {
				int confirmExit = JOptionPane.showConfirmDialog(
						null,
						"Are you sure you want to exit the game?",
						"Exit Game",
						JOptionPane.YES_NO_OPTION
						);

				if (confirmExit == JOptionPane.YES_OPTION) {
					Results();//show results so far
					System.exit(0);//exit
				}else{
					continue;//stay in game
				}
			}

			String input = betButton.getText().trim();

			if( input.isBlank() || !input.matches("\\d+")) continue;
			bet = Integer.parseInt(input);
			
			if(bet < 1 || bet > maxBet) {
				JOptionPane.showMessageDialog(null, "your Bet must be between 1$ and " +  maxBet + "$");
				continue;
			}
			bank--;

			valid = true;
		}

		return bet;

	}//end getBetAmount
	
	//==================================================================================================\\

	private void Results() {
		StringBuilder output = new StringBuilder("Game Over!\n\n");
		for(Bets r : rounds) {
			output.append(r.getSummary()).append("\n");
		}

		output.append("\nFinal Bank: $").append(bank).append("\n");
		if(bank <= 1) output.append("You Ran out of Money.");
		else if (bets >= MAX_BETS) output.append("You have reached the max number of rounds");


		JOptionPane.showMessageDialog(null, output.toString());
		
		
		//Store Score in high Score List
		highScore.add(new ScoreEntry(playerName, bank));
		highScore.sort((a, b) -> Integer.compare(b.score, a.score));
		
		//Show High Score table
		StringBuilder HighScore = new StringBuilder("High Score \n");
		for (int i = 0; i < highScore.size(); i++) {
			ScoreEntry entry = highScore.get(i);
			HighScore.append(i + 1).append(". ").append(entry.name)
.append(" your Bank acount is $").append(entry.score).append("\n");
		}
		
		JOptionPane.showMessageDialog(null, HighScore.toString(), "High Score", JOptionPane.PLAIN_MESSAGE);

	}//end Results

}//End Class DicePokerGame
