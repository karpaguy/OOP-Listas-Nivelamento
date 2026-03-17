package br.edu.ifsp.CardsDeal;

public class Deck {
    private final Card[] cardsCollection = new Card[48];

    public Deck() {
        int i = 0;
        for (Card.Suits suit : Card.Suits.values()) {
            for (Card.Rank rank : Card.Rank.values()) {

                // ##### DEBUG
                System.out.println("OK!" + i);
                System.out.println(suit.toString() + ": " + rank.toString());
                // ##### DEBUG

                cardsCollection[i++] = new Card(suit, rank);
            }
        }
    }
}
