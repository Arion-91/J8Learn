package OReilly_OOAP.TheGuitarShop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by arion on 07.11.2015.
 */
class ManadolinSpec extends InstrumentSpec {
    private Style style;

    public ManadolinSpec(Map properties) {
        super(properties);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof ManadolinSpec))
            return false;
        ManadolinSpec spec = (ManadolinSpec) otherSpec;
        if (!style.equals(spec.style))
            return false;
        return true;
    }
}
