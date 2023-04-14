package be.eonix.monkey.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Trainer {
    private Monkey monkey;

    public Trainer(String monkeyName) {

        this.monkey = new Monkey(monkeyName);
    }

    public void requestMonkeyToPerformForSpectator(Spectator spectator) {
        monkey.setObserver(spectator);
        monkey.performTricks();
    }
}
