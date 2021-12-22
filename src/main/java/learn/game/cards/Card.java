package learn.game.cards;

public class Card {

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }

    public String getName() {

        return String.format("%s of %s", rank.getName(), suit.getName());

    }
}
