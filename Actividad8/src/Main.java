import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        deck.head();
        deck.pick();
        List<Card> hand = deck.hand();

        for (Card card : hand) {
            System.out.println("Carta en la mano: " + card);
        }
    }
}
