package br.edu.ifsp.CardsDeal;


public class Card {
    enum Suits { CLUBS, DIAMONDS, HEARTS, SPADES };
    enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, JACK, QUEEN, KING};

    private Suits suit;
    private Rank rank;
    private boolean visibility;

    public Card (Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.visibility = false;
    }

    public boolean isVisible() {
        return this.visibility;
    }

    public void flipCard() {
        this.visibility = !visibility;
    }
}
