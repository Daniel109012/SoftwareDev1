package caseStudy;

import javax.swing.JOptionPane;

public class Version04 {

	public static void main(String[] args) {
		// Case study Version One
		
	    // define constants
	    final int NUMBER_OF_SUITS = 4;
	    final int CARDS_PER_SUIT = 13;
	    final int MAX_CARDS_PER_HAND = 7;
				
			    String windowTitle = "Black Jack";
			    String card;
			    String output = "";
				String[][] packOfCards = {
						{"AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC"},
		                {"AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD"},
		                {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"},
		                {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"}
				};
				
			    String [] playersHand = new String[MAX_CARDS_PER_HAND];  //default value is null
			    String [] computersHand = new String[MAX_CARDS_PER_HAND];  //default value is null

				

			    
	/*		    // select 10 cards
			    for (int loop = 0; loop < 10; loop++) {
			    	// select and display a card
				    card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
			      output = output + card + "  ";
			    }
	*/
			    

			    
			    // deal cards, print game status
			    deal(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT, playersHand, computersHand);
			    printGameStatus(playersHand, computersHand);
			    //print Pack
			    printPack(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
			    
			//    JOptionPane.showMessageDialog(null, output, windowTitle, JOptionPane.INFORMATION_MESSAGE);



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
				  
				    // define constant
				    final String EMPTY_VALUE = "empty";
				    String theCard;
				    int suit;
				    int cardNumber;
				    
				  do {
				    suit = (int)(Math.random() * numberSuits);
				    cardNumber = (int) (Math.random() * cardsPerSuit);

				    theCard = thePack [suit] [cardNumber];
				  }while(theCard == EMPTY_VALUE);
				  
				    // remove card from pack
				    thePack [suit] [cardNumber] = EMPTY_VALUE;

				    
				    return theCard;

				  
			  }//end method pickACard
			  
			  public static void deal(String [] [] thePack, int numberSuits, int cardsPerSuit, 
				         String [] playersCards, String [] computersCards) {
				    final int CARDS_IN_DEAL = 2;
				    for (int cardsDealt = 0; cardsDealt < CARDS_IN_DEAL; cardsDealt++) {
				      playersCards[cardsDealt] = pickACard(thePack, numberSuits, cardsPerSuit);
				      computersCards[cardsDealt] = pickACard(thePack, numberSuits, cardsPerSuit);
				    }
				  } // deal()

			  public static void printGameStatus(String [] playersCards, String [] computersCards) {
				    String output = "Computer ";
				    int value;
				    
				    for (int cardsInHand = 0; cardsInHand < computersCards.length; cardsInHand++) {
				      if (computersCards[cardsInHand] != null) {
				        // there is a card so display it
				        output = output + computersCards[cardsInHand] + " ";
				      }
				    }
				    
				    value = getValue(computersCards);
				    output = output + "Value: " + value;

				    
				    output = output + "\nPlayer ";
				    for (int cardsInHand = 0; cardsInHand < playersCards.length; cardsInHand++) {
				      if (playersCards[cardsInHand] != null) {
				        // there is a card so display it
				        output = output + playersCards[cardsInHand] + " ";
				      }
				    }
				    
				    value = getValue(playersCards);
				    output = output + "Value: " + value;

				    // display cards
				    JOptionPane.showMessageDialog(null, output, "Current Game Status", 
				JOptionPane.INFORMATION_MESSAGE);
				    
				  } // end printGameStatus()


			  public static int getValue(String [] cards) {
				    int value = 0;
				    char firstLetter;
				    for (int cardsInHand = 0; cardsInHand < cards.length; cardsInHand++) {
				      if (cards[cardsInHand] != null) {
				        // there is a card so get its value
				        // more code to go here
				    	  
				          // there is a card so get its value
				          firstLetter = cards[cardsInHand].charAt(0);
				          switch (firstLetter) {
				            case 'A':
				              value = value + 11;
				              break;
				            case '2':
				              value = value + 2;
				              break;
				            case '3':
				              value = value + 3;
				              break;
				            case '4':
				              value = value + 4;
				              break;
				            case '5':
				              value = value + 5;
				              break;
				            case '6':
				              value = value + 6;
				              break;
				            case '7':
				              value = value + 7;
				              break;
				            case '8':
				              value = value + 8;
				              break;
				            case '9':
				              value = value + 9;
				              break;
				            case '1': // ie 10
				            case 'J':
				            case 'Q':
				            case 'K':
				              value = value + 10;
				              break;
				          } // end switch


				      } // end if
				    } // end for
				    return value;

				  
			  }//exit getValue(String [] cards)
			  

		}//exit Class
