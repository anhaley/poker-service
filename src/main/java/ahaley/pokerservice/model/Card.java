package ahaley.pokerservice.model;

import lombok.Data;

@Data
public class Card {
    private final int rank, suit;

    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public static String rankAsString(int __rank) {
        return ranks[__rank];
    }
}