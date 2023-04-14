import be.eonix.monkey.model.Spectator;
import be.eonix.monkey.model.Trainer;

public class MonkeyShow {

    public static void main(String[] args) {
        Spectator spectator = new Spectator();
        Trainer trainer1 = new Trainer("Singe 1");
        Trainer trainer2 = new Trainer("Singe 2");
        trainer1.requestMonkeyToPerformForSpectator(spectator);
        trainer2.requestMonkeyToPerformForSpectator(spectator);
    }

}
