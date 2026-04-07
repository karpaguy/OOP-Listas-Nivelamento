package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;
import br.edu.ifsp.deck.Deck;

public class Hand {
    private Card vira;
    private final Player player1;
    private final Player player2;
    private final Deck handDeck;
    private Round[] rounds;
    private int roundsAcc;

    public Hand(Player player1, Player player2) {
        this.handDeck = new Deck();
        this.handDeck.shuffle();

        this.vira = handDeck.takeOne();

        this.player1 = player1;
        this.player2 = player2;

        this.player1.setCards(handDeck.take(3));
        this.player2.setCards(handDeck.take(3));

        rounds = new Round[3];
    }

    public void playRound() {
            rounds[roundsAcc++] = new Round(player2.chooseCard(),
                    player1.chooseCard(),
                    player2,
                    player1,
                    vira);
            System.out.println(rounds[roundsAcc]);
    };

    public boolean isDone() {
        if (roundsAcc == 3) return true;
        return getWinner() != null;
    }

    public String getWinner() {
        if (roundsAcc < 2) return null;

        String w0 = rounds[0].getWinner();
        String w1 = rounds[1].getWinner();

        // Condição: duas vitórias.
        if (w0 != null && w0.equals(w1)) return w0;
        // Condição: empate em round0, vitória round1.
        if (w0 == null && w1 != null) return w1;
        // Condição: vitória round0, empate round1.
        if (w0 != null && w1 == null) return w0;

        //Round2 ocorre. Empate total.
        if (roundsAcc == 3) {
            String w2 = rounds[2].getWinner();
            if (w2 == null && w0 != null) return w0;
            if (w2 != null) return w2;
        }

        return null;
    }


}

