package OReilly_OOAP.TheGameLibraty;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by arion on 22.11.2015.
 */
public class Unit {
    private String type;
    private int id;
    private String name;
    private Map properties;
    private List weapons;

    public Unit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addWeapon(Weapon weapon) {
        if (weapons == null)
            weapons = new LinkedList();
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String name, Object value) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(name, value);
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getProperties(String name) throws IllegalAccessException {
        if (properties == null)
            throw new IllegalAccessException("Что ты делаешь? Такоко свойства не существует!");
        Object value = properties.get(name);
        if (value == null)
            throw new IllegalAccessException("Значение данного свойства не задано!");
        return value;
    }

    public String getType() {
        return type;
    }
}
