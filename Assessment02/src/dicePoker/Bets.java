package dicePoker;

public class Bets {

	public int roundNumber; //which bet is being played
	private int bet; //the amount being bet
	private int[] rolls; //what number in which the dice fell
	private int winnings; //amount won or lost

	// stores the info about each bet or round

	public Bets(int roundNumber, int[] rolls, int bet, int winnings) {
		this.roundNumber = roundNumber;
		this.bet = bet;
		this.rolls = rolls;
		this.winnings = winnings;

	}//end Constructor Round

	public String getSummary() {
		StringBuilder output = new StringBuilder();

		output.append("======== Round " + roundNumber + " ========\n");
		output.append("Rolls   :  " + " ");
		for(int r : rolls)output.append(r).append(",  ");
		output.append("\nBet      :   $")
		.append(bet + "\n")
		;

		int net = winnings - bet;
		if (net >= 0) {
			output.append("Win     : +$").append(net).append("\n");
		}else {
			output.append("lose     : -$").append(Math.abs(net)).append("\n");
		}

		output.append("=======================");

		return output.toString();

	}//end getSummary. this displays the details for the bet or round


	public int getNetChange() {
		return winnings - bet; //to update the bank
	}

}//end class Round
