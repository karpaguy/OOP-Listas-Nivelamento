package br.edu.ifsp.CardsDeal;
public class Deck {
    private int cardAccumulator = 0;
    private final Card[] cardsCollection = new Card[48];
    // Usar a própria playerHand pra retornar cartas.

    public Deck() {
        int i = 0;
        for (Card.Suits suit : Card.Suits.values()) {
            for (Card.Ranks rank : Card.Ranks.values()) {
                cardsCollection[i++] = new Card(suit, rank);
                cardAccumulator++;
            }
        }
    }

    // Não há outra forma de remover cartas do baralho, somente comprando. Não é um baralho preparado ao truco.
    public Card drawRandomCard() {
        int randomPos = (int) (Math.random() * cardAccumulator);
        Card pickedCard = cardsCollection[randomPos];
        cardsCollection[randomPos] = cardsCollection[cardAccumulator - 1];
        cardAccumulator--;
        return pickedCard; // O objeto não some da memória fora do array, segue com apontamento.
    }

    public void returnCardToDeck(Card card) {
        if (cardAccumulator >= cardsCollection.length) {
            System.out.println("Deck is already full.");
            return;
        }
        cardsCollection[cardAccumulator] = card;
        cardAccumulator++;
    }

    // draw XMany;

}
