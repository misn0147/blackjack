package learn.game.players;

import java.util.List;

public class Gambler implements Player {
    private final String name;

    public Gambler(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
