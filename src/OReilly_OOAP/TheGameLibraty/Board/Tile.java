package OReilly_OOAP.TheGameLibraty.Board;

import OReilly_OOAP.TheGameLibraty.Unit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by arion on 22.11.2015.
 */
public class Tile {
    private List units;

    public Tile() {
        this.units = new LinkedList();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits() {
        units.clear();
    }

    protected List getUnits() {
        return units;
    }
}
