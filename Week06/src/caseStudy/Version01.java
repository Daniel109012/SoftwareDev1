package caseStudy;

import javax.swing.JOptionPane;

public class Version01 {

	public static void main(String[] args) {
		// Case study Version One
		
	    String windowTitle = "Black Jack";
	    String card;

		
		String[][] packOfCards = {
				{"AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC"},
                {"AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD"},
                {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"},
                {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"}
		};
		
	    // define constants
	    final int NUMBER_OF_SUITS = 4;
	    final int CARDS_PER_SUIT = 13;
	    
	    
	    //print Pack
	    printPack(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
	    
	    // select and display a card
	    card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
	    JOptionPane.showMessageDialog(null, card, windowTitle, JOptionPane.INFORMATION_MESSAGE);


	}//exit main
	
	  public static void printPack(String [][] thePack, int numberSuits, int cardsPerSuit) {
		  
		  String output = "";//Sting 

		    for (int suitloop = 0; suitloop < numberSuits; suitloop++) {
		        for (int cardloop = 0; cardloop < cardsPerSuit; cardloop++) {
		            output = output + thePack[suitloop] [cardloop] + "  ";
		        }//exit inter for loop selects columns
		        output = output + "\n";
		    }//exit outer for loop selects rows
		    
		    // display cards
		    JOptionPane.showMessageDialog(null, output, "All Cards", JOptionPane.INFORMATION_MESSAGE);

		  }//exit printPack Method
	  
	  public static String pickACard(String [][] thePack, int numberSuits, int cardsPerSuit) {
		  
		    int suit = (int)(Math.random() * numberSuits);
		    int cardNumber = (int) (Math.random() * cardsPerSuit);

		    String theCard = thePack [suit] [cardNumber];
		    return theCard;

		  
	  }//end method pickACard



}//exit Class
