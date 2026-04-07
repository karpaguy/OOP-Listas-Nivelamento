package br.edu.ifsp.game;
import br.edu.ifsp.deck.Card;

public class Player {
    private final String name;
    private int score;
    private Card[] cards;
    private int cardsAmount;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void setCards(Card[] cards) {
        if (cards == null) return;
        this.cards = cards; // Melhor que fori.
        cardsAmount = cards.length;
    }

    public Card chooseCard() {
        return this.cards[--cardsAmount];
    }

    public void incrementScore() {
        this.score++;
    }

    public String getName() {
        return this.name;
    }
    public int getScore() {
        return this.score;
    }
}
