package br.edu.ifsp;

import br.edu.ifsp.game.Game;
import br.edu.ifsp.game.Player;

public class Principal {
    public static void main(String args[]) {
        Player Douglas = new Player("Douglas");
        Player Fabio = new Player("Fabio");

        Game game = new Game(Douglas, Fabio);

        while (!game.isDone()) {
            game.play();
        }
    }
}
