package ahaley.pokerservice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;
    Random generator;

    private void initialize() {
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add( new Card(suit, rank) );
            }
        }
    }

    private void shuffle() {
        int i1, i2;
        Card temp;
        int size = cards.size() - 1;
        for (int i = 0; i < 100; i++) {
            i1 = generator.nextInt(size);
            i2 = generator.nextInt(size);
            temp = cards.get(i2);
            cards.set(i2, cards.get(i1));
            cards.set(i1, temp);
        }
    }

    Deck() {
        cards = new ArrayList<>();
        generator = new Random();
        initialize();
        shuffle();
    }

    public Card draw() {
        return cards.remove(0);
    }

    public int size() {
        return cards.size();
    }

}
