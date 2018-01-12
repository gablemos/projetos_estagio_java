package br.com.hf.ooad.InstrumentStore;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes =
                new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);

        MandolinSpec whatJuLikes =
                new MandolinSpec("Covernant", Builder.FENDER, Type.ELETRIC, Wood.ALDER, Wood.ALDER, Style.A);

        List matchingGuitars = inventory.search(whatErinLikes);
        List matchingMandolins = inventory.search(whatJuLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like there guitars:\n\n");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();

                System.out.println("We have a " +
                        spec.getBuilder() + " " + spec.getNumStrings() + "-string " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n" +
                        spec.getBackWood() + " back and sides,\n" +
                        spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n ----");
            }
            }else{
            System.out.println("Sorry, Erin we have nothin for you.");
        }


    }
    private static void initializeInventory(Inventory inventory){
        // Add gutiar to the inventory...
        inventory.addInstrument("V95693", 1499.95, new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("V9512",1549.95, new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("V666", 1199.99, new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6));

        inventory.addInstrument("G95693", 499.99, new MandolinSpec("Covernant", Builder.OLSON, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, Style.A));
    }
}
