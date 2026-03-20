package br.edu.ifsp.CardsDeal;

import java.util.Scanner;

public class Dealer {
    public void main(String[] args) {
        Deck deck = new Deck();
        final Card[] playerHand = new Card[3];
        int accHand = 0;

        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        while (opt != 4) {
            System.out.println("=== DEALER ===");
            System.out.println("1. Comprar Carta");
            System.out.println("2. Ver Mão");
            System.out.println("3. INDEFINIDO");
            System.out.println("4. Sair");

            System.out.println("Insira sua opção: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1:
                    playerHand[accHand++] = deck.drawRandomCard();
                    break;
                case 2:
                    for (int i = 0; i < accHand; i++) {

                    }
            }
        }
    }
}
