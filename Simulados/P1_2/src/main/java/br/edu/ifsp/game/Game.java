package br.edu.ifsp.game;

public class Game {
    private final Player player1;
    private final Player player2;
    private Hand[] hands;
    private int handsAccumulator;
    // A primeira mão estará engatilhada através de index.

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.hands = new Hand[100];
    }

    public void play() {
        if (this.hands[handsAccumulator] == null) {
            hands[handsAccumulator] = new Hand(player1, player2);
        }
        hands[handsAccumulator].playRound();

        if (hands[handsAccumulator].isDone()) {
            String handWinner = hands[handsAccumulator].getWinner();
            if (handWinner != null) {
                if (handWinner.equals(player1.getName())) player1.incrementScore();
                else if (handWinner.equals(player2.getName())) player2.incrementScore();
            }
            System.out.println(String.format("Vencedor da rodada: %s", handWinner));
            handsAccumulator++;
        }

    }

    public boolean isDone() {
        return (player1.getScore() == 12 || player2.getScore() == 12);
    };

    public Player getWinner() {
        return (player1.getScore() > player2.getScore() ? player1 : player2);
    }
}
