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
            System.out.println("4. Return Card to Deck");
            System.out.println("5. Draw X many cards.");
            System.out.println("6. Quit");

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
                    if (accHand == 0) {
                        System.out.println("Hand empty.");
                    } else {
                        int cardRevealOpt = chooseCardInHand(scanner, accHand, dealerCards);
                        dealerCards[cardRevealOpt].flipCard();
                        System.out.println(dealerCards[cardRevealOpt].readCard());
                    }
                    break;
                case 4:
                    if (accHand == 0) {
                        System.out.println("Hand empty.");
                    } else {
                        int cardToReturnIndex = chooseCardInHand(scanner, accHand, dealerCards);
                        deck.returnCardToDeck(dealerCards[cardToReturnIndex]);
                        dealerCards[cardToReturnIndex] = dealerCards[accHand--];
                    }
                    break;
            }
        } while (opt != 6) ;
    }

    int chooseCardInHand(Scanner scanner, int accHand, Card[] hand) {
        int option;
        do {
            System.out.println("Choose a card in hand:");
            for (int i = 0; i < accHand; i++) {
                if(hand[i].isVisible()) {
                    System.out.println(i + " - " + hand[i].readCard());
                } else {
                    System.out.println(i + " - Not Flipped");
                }
            }

            option = scanner.nextInt();

            if (option < 0 || option >= accHand) {
                System.out.println("Invalid option. Try again.");
            }
        } while (option < 0 || option >= accHand);
        return option;
    }
}
