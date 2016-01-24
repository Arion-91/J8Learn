package OReilly_OOAP.TheGuitarShop;

import java.util.Map;

class GuitarSpec extends InstrumentSpec {

  private int numString;

  public GuitarSpec(Map properties) {
    super(properties);
    this.numString = numString;
  }

  public int getNumString() {
    return numString;
  }

  public boolean matches(GuitarSpec otherSpec) {
    if (!super.matches(otherSpec))
      return false;
    if (!(otherSpec instanceof GuitarSpec))
      return false;
    GuitarSpec spec = (GuitarSpec) otherSpec;
    if (numString != spec.numString)
      return false;
    return true;
  }
}
