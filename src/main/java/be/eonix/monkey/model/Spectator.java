package be.eonix.monkey.model;

import be.eonix.monkey.event.MonkeyTrickEvent;

public class Spectator implements MonkeyObserver {

    @Override
    public void notify(MonkeyTrickEvent evt) {
        
        StringBuilder spectatorReaction = new StringBuilder();
        switch (evt.getTrickType()) {
        case MUSIC:
            spectatorReaction.append("Le spectateur siffle pendant le tour d'acrobatie");
            break;
        case ACROBATIC:
            spectatorReaction.append("Le spectateur applaudit pendant le tour d'acrobatie");
        }
        spectatorReaction.append(" '").append(evt.getTrick()).append("'");
        spectatorReaction.append(" du ").append(evt.getName());
        System.out.println(spectatorReaction);
    }

}
