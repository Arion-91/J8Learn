package OReilly_OOAP.TheGuitarShop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by arion on 07.11.2015.
 */
class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches (InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName)))
                return false;
        }
        return true;
    }
    //    private Builder builder;
//    private String model;
//    private Type type;
//    private Wood backWood;
//    private Wood topWood;
//
//    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
//        this.builder = builder;
//        this.model = model;
//        this.type = type;
//        this.backWood = backWood;
//        this.topWood = topWood;
//    }
//
//    public Builder getBuilder() {
//        return builder;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public Wood getBackWood() {
//        return backWood;
//    }
//
//    public Wood getTopWood() {
//        return topWood;
//    }
//
//    public boolean matches(InstrumentSpec otherSpec) {
//        if (builder != otherSpec.getBuilder())
//            return false;
//        if (model != null && !model.equals("") && !model.equals(otherSpec.model))
//            return false;
//        if (type != otherSpec.type)
//            return false;
//        if (backWood != otherSpec.backWood)
//            return false;
//        if (topWood != otherSpec.topWood)
//            return false;
//        return true;
//    }
}
