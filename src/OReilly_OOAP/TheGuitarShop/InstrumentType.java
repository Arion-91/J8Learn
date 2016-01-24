package OReilly_OOAP.TheGuitarShop;

/**
 * Created by arion on 08.11.2015.
 */
enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    @Override
    public String toString() {
        switch (this) {
            case GUITAR:    return "Guitar";
            case BANJO:     return "Banjo";
            case DOBRO:     return "Dobno";
            case FIDDLE:    return "Fiddle";
            case BASS:      return "Bass";
            case MANDOLIN:  return "Mandolin";
            default:        return "Unspecified";
        }
    }
}
