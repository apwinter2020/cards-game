import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private ArrayList<Card> cards;
    private int numberOfCards;

    private String[] suites = {"C", "D", "H", "S"};
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Deck() {
        cards = new ArrayList<>();
        createCards();

    }

    private void createCards() {
        this.numberOfCards = suites.length * ranks.length;
        for (int i = 0; i < numberOfCards; i++) {
            cards.add(new Card(ranks[i % 13], suites[i / 13]));
        }
    }

    public Card getCard() {
        return cards.remove(0);
    }

    public boolean addCard(Card card) throws IllegalArgumentException{
        if (cards.size() >= numberOfCards) {
            throw new IllegalArgumentException("Deck is full");
        }
        return cards.add(card);

    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

}
