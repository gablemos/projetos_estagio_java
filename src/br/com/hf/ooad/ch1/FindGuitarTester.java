package br.com.hf.ooad.ch1;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like there guitars:");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n" +
                        guitar.getBackWood() + " back and sides,\n" +
                        guitar.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n ----");
            }
            }else{
            System.out.println("Sorry, Erin we have nothin for you.");
        }
    }
    private static void initializeInventory(Inventory inventory){
        // Add gutiar to the inventory...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512",1549.95, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
    }
}
