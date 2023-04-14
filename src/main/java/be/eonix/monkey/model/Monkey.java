package be.eonix.monkey.model;

import java.util.HashMap;
import java.util.Random;

import be.eonix.monkey.event.MonkeyTrickEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Monkey {
    private String name;
    private HashMap<TrickType, String> tricks;

    @Getter
    @Setter
    private MonkeyObserver observer;

    Monkey(String name) {
        this.name = name;
        tricks = new HashMap<>();
        tricks.put(TrickType.ACROBATIC, "Saute à la corde");
        tricks.put(TrickType.MUSIC, "Joue du violon");
    }

    public void performTricks() {
        Object[] tricksKey = tricks.keySet().toArray();
        new Random().nextInt(tricksKey.length);

        tricks.forEach((k, v) -> {
            observer.notify(new MonkeyTrickEvent(this.name, v, k));
        });
    }
}
