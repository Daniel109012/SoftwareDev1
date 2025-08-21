package dicePoker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DicePokerGame {

	private static final int MAX_BETS = 5; //the maximum numbers of rounds or bets in a single start
	private static final int MAX_RESTARTS = 5; //max number of restarts
	private static final int STARTING_BANK = 6; //default number of Dollars in the bank 
	private static List<ScoreEntry> highScore = new ArrayList<ScoreEntry>(); // Game results
	
	private List<Bets> rounds; //details for each bet
	private int bank = STARTING_BANK; // players money
	private int bets = 0; //tracks number of rounds
	private Dice dice; //rolls of dice
	private String playerName; //name of player during the game
	
	
	//==================================================================================================\\

	public DicePokerGame() {
		dice = new Dice();
		rounds = new ArrayList<>();

	}//End constructor DicePokerGame
	
	//==================================================================================================\\

	public void start() { //loops game until restart limit is reached or player quits
		boolean playAgain;
		int restartCount = 0; //how many restarts happen
		
		playerName = JOptionPane.showInputDialog("Enter Your Name");

		do {
			restart();
			betRounds();
			restartCount++;
			
			if(restartCount >= MAX_RESTARTS) { //max number of restarts
				JOptionPane.showMessageDialog(null, "You have reached the max Number of Restarts (" + restartCount + "). Game Over!");
				break;
			}

			int option = JOptionPane.showConfirmDialog(null, " Would you want to restart the game?",
					"Continue?",
					JOptionPane.YES_NO_OPTION);
			playAgain = (option == JOptionPane.YES_OPTION);

		}while (playAgain);

	}//end Method start

	private void restart(){ //resets game to fresh game
		bank = STARTING_BANK;
		bets = 0;
		rounds.clear();
	}
	
	//==================================================================================================\\

	private void betRounds() { //bet rounds until the money runs out

		boolean anotherBet = true;

		while (bank > 1 && bets < MAX_BETS && anotherBet) {
			int bet = getBetAmount();
			dice.rollDice();
			int[] diceRolls = dice.getDiceRolls();
			int winnings = Wins.calculateWinnings(diceRolls, bet);


			Bets gameRound = new Bets(++bets, diceRolls, bet, winnings);
			rounds.add(gameRound);
			bank += gameRound.getNetChange();

			JOptionPane.showMessageDialog(null, /*rollMsg +*/ "\n" + gameRound.getSummary());

		}
		Results();//result method

	}

	//==================================================================================================\\
	
	private int getBetAmount() { //asks the player the amount to bet and if user quits mid game
		int bet = 1;
		int maxBet;
		boolean valid = false;
		
		


		while (!valid) {
			JTextField betButton = new JTextField();
			

			//add code for bank less than 4
			if(bank == 1) {
				maxBet = 1;
			}else if(bank > 4) 
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

	private void Results() { //display the game summary updates the score and displays it
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
