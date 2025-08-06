package dicePoker;

public class WinningsCalculator {
	
	public static int calculateWinnings(int[] rolls, int bet) {
		int winnings = 0;
		
	    // Count how many times each face value appears
	    int[] counts = new int[7]; // index 1–6 (ignore index 0)
	    for (int roll : rolls) {
	        counts[roll]++;
	    }

	    // Simple scoring logic
	    if (containsOfAKind(counts, 5)) {
	        winnings = bet * 20; // Five of a kind
	    } else if (containsOfAKind(counts, 4)) {
	        winnings = bet * 10; // Four of a kind
	    } else if (containsFullHouse(counts)) {
	        winnings = bet * 8; // Full house
	    } else if (containsOfAKind(counts, 3)) {
	        winnings = bet * 5; // Three of a kind
	    } else if (containsTwoPairs(counts)) {
	        winnings = bet * 3; // Two pairs
	    } else if (containsOfAKind(counts, 2)) {
	        winnings = bet * 2; // One pair
	    } else {
	        winnings = 0; // No win
	    }
		return winnings;
	}
	
	private static boolean containsOfAKind(int[] counts, int n) {
	    for (int count : counts) {
	        if (count == n) {
	            return true;
	        }
	    }
	    return false;
	}

	private static boolean containsFullHouse(int[] counts) {
	    boolean hasThree = false;
	    boolean hasTwo = false;
	    for (int count : counts) {
	        if (count == 3) hasThree = true;
	        if (count == 2) hasTwo = true;
	    }
	    return hasThree && hasTwo;
	}

	private static boolean containsTwoPairs(int[] counts) {
	    int pairs = 0;
	    for (int count : counts) {
	        if (count == 2) pairs++;
	    }
	    return pairs == 2;
	}

}
