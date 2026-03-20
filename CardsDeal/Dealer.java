package br.edu.ifsp.CardsDeal;
import java.util.Scanner;

class Dealer {
    public void main(String[] args) {
        Deck deck = new Deck();
        final Card[] dealerCards = new Card[3];
        int accHand = 0;

        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("=== DEALER ===");
            System.out.println("1. Draw card");
            System.out.println("2. See hand");
            System.out.println("3. Flip/Unflip card");
            System.out.println("4. Quit");

            System.out.println("Choose your option: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    if (accHand >= 3) {
                        System.out.println("Maximum hand cards reached.");
                    } else {
                        dealerCards[accHand] = deck.drawRandomCard();
                        accHand++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < accHand; i++) {
                        System.out.println( dealerCards[i].readCard() );
                    }
                    break;

                case 3:
                    System.out.println("Choose a card to reveal: ");
                    for (int j = 0; j < accHand; j++) {
                        System.out.println(j);
                    }

                    int cardRevealOpt = scanner.nextInt();
                    if (cardRevealOpt >= 0 && cardRevealOpt < accHand) {
                        dealerCards[cardRevealOpt].flipCard();
                        System.out.println(dealerCards[cardRevealOpt].readCard());
                    }
            }
        } while (opt != 4) ;
    }
}
