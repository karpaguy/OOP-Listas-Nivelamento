package br.edu.ifsp.CardsDeal;

public class Card {
    enum Suits {CLUBS, DIAMONDS, HEARTS, SPADES }
    enum Ranks {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, JACK, QUEEN, KING}

    private Suits suit;
    private Ranks rank;
    private boolean visibility;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
        this.visibility = false;
    }

    public boolean isVisible() {
        return this.visibility;
    }

    public void flipCard() {
        this.visibility = !this.visibility;
    }

    public String readCard() {
        if (!visibility) {
            return "Card is face down";
        }
        return this.suit.toString() + " of " + this.rank.toString();
    }
}
