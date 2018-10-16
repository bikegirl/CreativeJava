package HW3;

import java.util.Random;

public class Deck {
	
	//size of the deck and the size of the array
	public static final int FULL_DECK=52;
	Card[] deckOfCards = new Card[FULL_DECK];
	private int currentCard = -1;
	//an array deck to hold the card
		
	//create a deck of cards
	Deck() {
	    int index = 0;
	    for(int suit = 0; suit <= 3; suit++) {
	        for(int rank = 1; rank <= 13; rank++) {
	            deckOfCards[index] = new Card(suit, rank);
	            index++;
	        }
	    }

	}
	
	
	public void shuffle() {
		Random randomIndex = new Random();
		for (int i = 0; i <= 51; i++) {
             int r = i + randomIndex.nextInt(52 - i); 
              
             //swap cards 
             Card temp = deckOfCards[r]; 
             deckOfCards[r] = deckOfCards[i]; 
             deckOfCards[i] = temp; 
		}
		
//		//print deck to ensure randomized
//	    for(int i = 0; i < FULL_DECK; i++) {
//	    	System.out.print(deckOfCards[i].getRank());
//	    	System.out.println(deckOfCards[i].getSuit());
//	    }
	}
	
	public int getCurrentCard() {
		return currentCard;
	}
	
	public Card dealCard() {
		currentCard++;
		return deckOfCards[currentCard];
		
	}
	
	
}
