package learn.game.blackjack;

import learn.game.cards.Hand;
import learn.game.players.Dealer;
import learn.game.players.Gambler;
import learn.game.players.Player;

import java.util.ArrayList;

public class Blackjack {
    private final Gambler player;
    private final Dealer dealer;

    private Player winner;
    private ArrayList<Hand> hand = new ArrayList<Hand>();


    private boolean over;

    public Blackjack(Gambler player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }


    public ArrayList<Hand> getHand() {
        return hand;
    }

    public Player getWinner() {
        return winner;
    }


    public boolean isOver() {
        return over;
    }


}
