package br.com.hf.ooad.gsf.unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {

    private int id;
    private String type;
    private String nome;
    private List weapons;
    private Map properties;

    public Unit(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getWeapons() {
        return weapons;
    }

    public void addWeapons(Weapon weapon) {
        if (weapons == null){
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public Object getProperty(String property){
            if (properties == null) {
                throw new RuntimeException("No properties for this Unit.");
            }
            Object value = properties.get(property);
            if(value == null){
                throw new RuntimeException("Request for non-existent property.");
            }else{
                return value;
            }
    }

    public void setProperty(String property, Object value) {
        if (properties == null){
            properties = new HashMap();
        }
        properties.put(property, value);
    }
}
