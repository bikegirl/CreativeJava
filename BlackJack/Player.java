package HW3;

import java.util.Random;

public class Player {
	
	private int playerHand;
	private Card faceDown;
	private Card currentCard;
	private int hasAce;
	
	Player() {
		playerHand=0;
	}
	
	public int hasAce() {
		return hasAce;
	}
	
	public void setFaceDown(Card passedCard) {
		
		faceDown = passedCard;
	}
	
	public int getFaceDownRank() {
		
		return faceDown.getRank();
	}
	
	public String getFaceDownSuit() {
		
		return faceDown.getSuit();
	}
	
	
	public int getPlayerHand() {
		
		return playerHand;
		
	}
	
	//set the player hand.  Keeps track of Aces for the players and adjust score of 
	//Ace to 11 and Jack, Queen, King to 10
	public void setPlayerHand(Card passedCard) {
		//keep track of aces for each player
		//always make Ace equal to 11 unless specified at the end
		if (passedCard.getRank() == 1) {
			hasAce++;
			playerHand += 11;
			//this was just for debugging purposes
			//System.out.println("Print Ace value: " + hasAce);
		} else if (passedCard.getRank() >= 11) {
			playerHand += 10;	
		} else {
			playerHand += passedCard.getRank();
		}
		//keep track of current card
		currentCard = passedCard;	
	}
	
	
	public void setFinalHand(){
		playerHand = playerHand - (hasAce*11);
	}
	
	public int getCurrentRank() {
		
		return currentCard.getRank();
		
	}
	
	public String rankToString(int numberToConvert) {
		
		if (numberToConvert == 1){
			return "Ace";
		} else if (numberToConvert == 11) {
			return "Jack";
		} else if (numberToConvert == 12) {
			return "Queen";
		} else if (numberToConvert == 13) {
			return "King";
		} else {
			return Integer.toString(numberToConvert);
		}
	}
	
	public String getCurrentSuit() {
		
		return currentCard.getSuit();
		
	}

		
}
	

