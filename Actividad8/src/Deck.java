import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        cards = new ArrayList<>();
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colors = {"negro", "rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String color : colors) {
                for (String value : values) {
                    cards.add(new Card(suit, color, value));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public Card head() throws Exception {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck");
            return card;
        } else {
            throw new Exception("Se han agotado las cartas");
        }
    }

    public Card pick() throws Exception {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck");
            return card;
        } else {
            throw new Exception("Se han agotado las cartas");
        }
    }

    public List<Card> hand() throws Exception {
        List<Card> hand = new ArrayList<>();
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card.toString());
                hand.add(card);
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck");
        } else {
            throw new Exception("Se han agotado las cartas");
        }
        return hand;
    }
}
