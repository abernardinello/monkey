package be.eonix.monkey.model;

import be.eonix.monkey.event.MonkeyTrickEvent;

public interface MonkeyObserver {
    public void notify(MonkeyTrickEvent evt);
}
