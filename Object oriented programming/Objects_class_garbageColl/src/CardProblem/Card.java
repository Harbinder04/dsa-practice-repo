package CardProblem;

import java.util.Objects;

public class Card {
    private final int rank;
    private final int suit;

    // Kinds of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    public Card(int rank, int suit) {
//        assert isValidRank(rank);
//        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static String rankToString(int rank) {
        return switch (rank) {
            case ACE -> "Ace";
            case DEUCE -> "Deuce";
            case THREE -> "Three";
            case FOUR -> "Four";
            case FIVE -> "Five";
            case SIX -> "Six";
            case SEVEN -> "Seven";
            case EIGHT -> "Eight";
            case NINE -> "Nine";
            case TEN -> "Ten";
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            default ->  null;
                //Handle an illegal argument.  There are generally two
                //ways to handle invalid arguments, throwing an exception
                //(see the section on Handling Exceptions) or return null
        };
    }

    public static String suitToString(int suit) {
        return switch (suit) {
            case DIAMONDS -> "Diamonds";
            case CLUBS -> "Clubs";
            case HEARTS -> "Hearts";
            case SPADES -> "Spades";
            default -> null;
        };
    }
}

