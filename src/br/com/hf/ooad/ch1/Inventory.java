package br.com.hf.ooad.ch1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model, Type type,
                          Wood backWood, Wood topWood){

        GuitarSpec spec = new GuitarSpec(model, builder, type, backWood, topWood);

        Guitar guitar = new Guitar (serialNumber, price, spec);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar){
        List matchingGuitars = new LinkedList();
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            //Ignore serial number since that's unique
            //Ignore price since that's unique
            if(searchGuitar.getBuilder() != guitar.getSpec().getBuilder()){
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getSpec().getModel().toLowerCase()))){
                continue;
            }

            if(searchGuitar.getType() != guitar.getSpec().getType()){
                continue;
            }

            if(searchGuitar.getBackWood() != guitar.getSpec().getBackWood()){
                continue;
            }

            if(searchGuitar.getTopWood() != guitar.getSpec().getTopWood()){
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
