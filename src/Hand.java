import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int numberOfCards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public Hand(ArrayList<Card> cards) {
        super();
        addCards(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCards(ArrayList<Card> cards) {
        this.cards.addAll(cards);
        numberOfCards += cards.size();
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }


}
