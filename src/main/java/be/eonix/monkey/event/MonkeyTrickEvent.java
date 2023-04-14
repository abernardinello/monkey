package be.eonix.monkey.event;

import be.eonix.monkey.model.TrickType;
import lombok.Data;

@Data
public class MonkeyTrickEvent {


    private final String name;
    private final String trick;
    private final TrickType trickType;

}
