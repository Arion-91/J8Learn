package OReilly_OOAP.TheDoorsOfDug;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by arion on 01.11.2015.
 */
public class DogDoor {
    private boolean open;
    ArrayList<Bark> allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        this.open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void addAllowedBark(Bark allowedBark) {
        if (this.allowedBark == null) {
            this.allowedBark = new ArrayList<>();
        }
        this.allowedBark.add(allowedBark);
    }

    public ArrayList<Bark> getAllowedBark() {
        return allowedBark;
    }
}
