package dicePoker;

public class Round {
	
	public int roundNumber;
	private int bet;
	private int[] rolls;
	private int winnings;
	
	public Round(int roundNumber, int bet, int[] rolls, int winnings) {
		this.roundNumber = roundNumber;
		this.bet = bet;
		this.rolls = rolls;
		this.winnings = winnings;
		
	}//end Constructor Round
	
	public String getSummary() {
	StringBuilder output = new StringBuilder();
	
	output.append("====== Round =======\n ")
	.append(roundNumber)
	.append(": Bet $")
	.append(bet)
	.append(", Rolls: ");
	
	for(int r : rolls) output.append(r).append(", ");
	int net = winnings - bet;
	if (net >= 0) {
		output.append("Result     : +$").append(net).append("\n");
	}else {
		output.append("Result     : -$").append(Math.abs(net)).append("\n");
	}
	
	output.append("=======================");
	
	return output.toString();
	
	}//end getSummary
	
	public int getNetChange() {
		return winnings - bet;
	}

}//end class Round
