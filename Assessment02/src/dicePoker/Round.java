package dicePoker;

public class Round {
	
	public int roundNumber;
	private int bet;
	private int[] rolls;
	private int winnings;
	
	public Round(int roundNumber, int[] rolls, int bet, int winnings) {
		this.roundNumber = roundNumber;
		this.bet = bet;
		this.rolls = rolls;
		this.winnings = winnings;
		
	}//end Constructor Round
	
	public String getSummary() {
	StringBuilder output = new StringBuilder();
	
	
	
	output.append("======== Round " + roundNumber + " ========\n");
//	.append(roundNumber)
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
	
	}//end getSummary
	
//	private StringBuilder roll(int r) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public int getNetChange() {
		return winnings - bet;
	}

}//end class Round
