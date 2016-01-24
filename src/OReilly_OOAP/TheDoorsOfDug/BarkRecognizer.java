package OReilly_OOAP.TheDoorsOfDug;

/**
 * Created by arion on 03.11.2015.
 */
class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println(" Bark recognizer: Heard a '" + bark.getSound() + "'");

//        if (door.getAllowedBark().equalsq(bark))
        if (door.getAllowedBark().contains(bark))
            door.open();
        else
            System.out.println("This dog is not allowed.");

    }
}
