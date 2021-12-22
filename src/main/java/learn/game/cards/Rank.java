package learn.game.cards;

public enum Rank {
    TWO_OF_CLUBS(2, "2 of Clubs"),
    THREE_OF_CLUBS(3, "3 of Clubs"),
    FOUR_OF_CLUBS(4, "4 of Clubs"),
    FIVE_OF_CLUBS(5, "5 of Clubs"),
    SIX_OF_CLUBS(6, "6 of Clubs"),
    SEVEN_OF_CLUBS(7, "7 of Clubs"),
    EIGHT_OF_CLUBS(8, "8 of Clubs"),
    NINE_OF_CLUBS(9,"9 of Clubs"),
    TEN_OF_CLUBS(10,"10 of Clubs"),
    JACK_OF_CLUBS(11, "Jack of Clubs"),
    QUEEN_OF_CLUBS(12, "Queen of Clubs"),
    KING_OF_CLUBS(13, "King of Clubs"),
    ACE_OF_CLUBS(14, "Ace of Clubs"),

    TWO_OF_SPADES(2, "2 of Spades"),
    THREE_OF_SPADES(3, "3 of Spades"),
    FOUR_OF_SPADES(4, "4 of Spades"),
    FIVE_OF_SPADES(5, "5 of Spades"),
    SIX_OF_SPADES(6, "6 of Spades"),
    SEVEN_OF_SPADES(7, "7 of Spades"),
    EIGHT_OF_SPADES(8, "8 of Spades"),
    NINE_OF_SPADES(9,"9 of Spades"),
    TEN_OF_SPADES(10,"10 of Spades"),
    JACK_OF_SPADES(11, "Jack of Spades"),
    QUEEN_OF_SPADES(12, "Queen of Spades"),
    KING_OF_SPADES(13, "King of Spades"),
    ACE_OF_SPADES(14, "Ace of Spades"),

    TWO_OF_HEARTS(2, "2 of Hearts"),
    THREE_OF_HEARTS(3, "3 of Hearts"),
    FOUR_OF_HEARTS(4, "4 of Hearts"),
    FIVE_OF_HEARTS(5, "5 of Hearts"),
    SIX_OF_HEARTS(6, "6 of Hearts"),
    SEVEN_OF_HEARTS(7, "7 of Hearts"),
    EIGHT_OF_HEARTS(8, "8 of Hearts"),
    NINE_OF_HEARTS(9,"9 of Hearts"),
    TEN_OF_HEARTS(10,"10 of Hearts"),
    JACK_OF_HEARTS(11, "Jack of Hearts"),
    QUEEN_OF_HEARTS(12, "Queen of Hearts"),
    KING_OF_HEARTS(13, "King of Hearts"),
    ACE_OF_HEARTS(14, "Ace of Hearts"),

    TWO_OF_DIAMONDS(2, "2 of Diamonds"),
    THREE_OF_DIAMONDS(3, "3 of Diamonds"),
    FOUR_OF_DIAMONDS(4, "4 of Diamonds"),
    FIVE_OF_DIAMONDS(5, "5 of Diamonds"),
    SIX_OF_DIAMONDS(6, "6 of Diamonds"),
    SEVEN_OF_DIAMONDS(7, "7 of Diamonds"),
    EIGHT_OF_DIAMONDS(8, "8 of Diamonds"),
    NINE_OF_DIAMONDS(9,"9 of Diamonds"),
    TEN_OF_DIAMONDS(10,"10 of Diamonds"),
    JACK_OF_DIAMONDS(11, "Jack of Diamonds"),
    QUEEN_OF_DIAMONDS(12, "Queen of Diamonds"),
    KING_OF_DIAMONDS(13, "King of Diamonds"),
    ACE_OF_DIAMONDS(14, "Ace of Diamonds"),;

    private final int value;
    private final String name;

    Rank(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
