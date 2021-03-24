package ahaley.pokerservice.model;


public class Hand {

    private Card[] cards;
    private int[] value;
    private static final int HAND_SIZE = 5;
    private static final int VALUES_SIZE = 6;

    Hand(Deck deck) {
        value = new int[VALUES_SIZE];
        cards = new Card[HAND_SIZE];
        for (int i = 0; i < HAND_SIZE; i++) {
            cards[i] = deck.draw();
        }
    }

    void print() {
        for (int i = 0; i < HAND_SIZE; i++) {
            System.out.println(cards[i]);
        }
    }

    int compareTo(Hand otherHand) {
        for (int i = 0; i < VALUES_SIZE; i++) {
            if (value[i] > otherHand.value[i])
                return 1;
            else if (value[i] < otherHand.value[i])
                return -1;
        }
        return 0;
    }
}
