package HW3;

public class Card {
	
	private String suit;
	private int rank;
	
	Card() {
		this.rank = 0;
		this.suit = "Spade";
	}
	
	
	
	Card(int passedSuit, int passedRank) {
		
		this.rank = passedRank;
		if (passedSuit == 0) {
			this.suit = "Club";
		} else if (passedSuit == 1) {
			this.suit = "Spade";
		} else if (passedSuit == 2) {
			this.suit = "Heart";
		} else if (passedSuit == 3) {
			this.suit = "Diamond";
		} else {
			System.out.println("Error on assigning Suit");
		}
	}
	
	public int getRank() {
		return this.rank;
	}

	public String getSuit() {
		return this.suit;
	}
	
	public void setRank(int passedRank) {
		this.rank = passedRank;
	}
	
	public void setSuit(int passedSuit) {
		if (passedSuit == 0) {
			this.suit = "Club";
		} else if (passedSuit == 1) {
			this.suit = "Spade";
		} else if (passedSuit == 2) {
			this.suit = "Heart";
		} else if (passedSuit == 3) {
			this.suit = "Diamond";
		} else {
			System.out.println("Error on assigning Suit");
		}
	}
}
