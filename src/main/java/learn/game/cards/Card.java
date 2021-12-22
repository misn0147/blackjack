package learn.game.cards;

public class Card {

    private final Rank rank;

    public Card(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String getName() {
        return String.format("%s", rank.getName());
    }
}
