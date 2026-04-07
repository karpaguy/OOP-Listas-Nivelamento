package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Round {
    private String winner;

    // E se eu só fizer um único constructor de winner, recebendo get winner...
    public Round(Card card2, Card card1, Player player2, Player player1, Card vira) {
        int result = card1.compareValueTo(card2, vira);
        if (result > 0) this.winner = player1.getName();
        if (result < 0) this.winner = player2.getName();
        if (result == 0) this.winner = null;
    }

    public String getWinner() {
        return this.winner == null ? "Empate" : winner;
    }
}

/*
Static é uma possibilidade!
public class Round {
    private static String winner;

    // E se eu só fizer um único constructor de winner, recebendo get winner...
    private Round(Card card2, Card card1, Player player2, Player player1, Card vira) {
        int result = card1.compareValueTo(card2, vira);
        if (result > 0) winner = player1.getName();
        else if (result < 0) winner = player2.getName();
        if (result == 0) winner = null;
    }

    // Utilizará this.info, por não passar parâmetro.
    public static String getWinner() {
        return winner;
    }
}
 */
