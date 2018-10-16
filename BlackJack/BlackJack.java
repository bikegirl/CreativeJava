package HW3;

import java.util.Scanner;

public class BlackJack {
	
	public static void main(String[] args) {
		
		Player Becca = new Player();
		Player Dealer = new Player();
		
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		//		for debugging
		//		Card tempScore = myDeck.dealCard();
		//		System.out.println(tempScore.getRank());
		//		Becca.setPlayerHand(tempScore);
		
		//Set the face-down card for both, Dealer and Player do not know
		Card firstCard = myDeck.dealCard();
		Dealer.setFaceDown(firstCard);
		Dealer.setPlayerHand(firstCard);
		Card secondCard = myDeck.dealCard();
		Becca.setFaceDown(secondCard);
		Becca.setPlayerHand(secondCard);
		
		
		//Set face-up cards, the first to be displayed to the player
		Dealer.setPlayerHand(myDeck.dealCard());
		Becca.setPlayerHand(myDeck.dealCard());
		
		//Display face-up card to the user
		System.out.println("*Welcome to black jack*");
		System.out.print("Face-down cards have already been dealt.");
		System.out.println(" Here are your Face-up cards: "); 
		System.out.println("Computer: " + Dealer.rankToString(Dealer.getCurrentRank()) + " " + Dealer.getCurrentSuit() +
		"     You: " + Becca.rankToString(Becca.getCurrentRank()) + " " + Becca.getCurrentSuit());
		
		//get user input to determine to continue playing or not
		Scanner scan = new Scanner(System.in);
		boolean hitMe = true;
		while (hitMe) {
			
			System.out.println("\nHit you? y or n");
			String userResponse = scan.nextLine();
			if (userResponse.equals("y")){
				
				hitMe = true;
	
				Becca.setPlayerHand(myDeck.dealCard());	
				
				System.out.print(Becca.rankToString(Becca.getCurrentRank()) + " " + Becca.getCurrentSuit());
				
			} else {
				hitMe = false;
			}
			
		}
		
		//Computer strategy, keeps taking cards if less than 17
		//Computer will display for player it's next cards chosen if any. 
		while(Dealer.getPlayerHand() < 17) {
			Dealer.setPlayerHand(myDeck.dealCard());
			System.out.println("\nComputer next card: " + Dealer.rankToString(Dealer.getCurrentRank()) + " " + Dealer.getCurrentSuit());
		}
		
		System.out.print("\nShow Face-down cards: ");
		System.out.println("\nComputer: " + Dealer.rankToString(Dealer.getFaceDownRank()) + " " + Dealer.getFaceDownSuit() + 
		"     You: " + Becca.rankToString(Becca.getFaceDownRank()) + " " + Becca.getFaceDownSuit());
		
		//adjust both of the player's Hand before results if they were dealt Aces
		
		//Dealer will always adjust the value of his Ace, if over 21
		if (Dealer.getPlayerHand() > 21) {
			if (Dealer.hasAce() != 0) {
			Dealer.setFinalHand();
			}
		}
		
		//Ask play if they would like to adjust their score, Ace will Always be calculated as 11 
		//unless otherwise specified by the player.
		if (Becca.hasAce() > 0) {
			System.out.println("\n\nYou have Aces in your hand.");
			System.out.println("Your current score is: " + Becca.getPlayerHand());
			System.out.println("\nWould you like to change the value of your Ace to 1? y or n");
//Ask about this scanner, can I use more than once or do I need to make a new object?			
			String choice = scan.nextLine();
			if (choice.equals("y")){
				Becca.setFinalHand();
			}
		}		
		
		//Who won?  Printing out the winner message
		if ( Dealer.getPlayerHand() > 21 ) {
			System.out.printf("\nTotals:  Computer-%d   You-%d", Dealer.getPlayerHand(), Becca.getPlayerHand());
			System.out.println("\nDealer Busts!  You win!");
		} else if (Dealer.getPlayerHand() <= 21 & Dealer.getPlayerHand() > Becca.getPlayerHand()) {
			System.out.printf("\nTotals:    Computer-%d     You-%d", Dealer.getPlayerHand(), Becca.getPlayerHand());			
			System.out.println("\nComputer Wins!");
		} else if (Becca.getPlayerHand() > 21){
			System.out.printf("\nTotals:    Computer-%d     You-%d", Dealer.getPlayerHand(), Becca.getPlayerHand());			
			System.out.println("\nComputer Wins!  You went over 21.");
		} else if (Dealer.getPlayerHand() == Becca.getPlayerHand()) {
			System.out.printf("\nTotals:    Computer-%d     You-%d", Dealer.getPlayerHand(), Becca.getPlayerHand());				
			System.out.print("\nPush!  Scores are tied.");
		} else {
			System.out.printf("\nTotals:    Computer-%d     You-%d", Dealer.getPlayerHand(), Becca.getPlayerHand());			
			System.out.println("\nPlayer Wins!");
		}
		
		
		
	}
}

		

