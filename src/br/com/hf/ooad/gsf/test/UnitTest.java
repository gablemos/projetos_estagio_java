package br.com.hf.ooad.gsf.test;

import br.com.hf.ooad.gsf.unit.Unit;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UnitTest {

    @Test
    public void testUnit(){
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit();
        System.out.println("...Created a new unit");

        unit.setType("infantry");
        System.out.println("...Set \"type\" to \"infantry\" ");

        Map properties = new HashMap();
        properties.put("hitPoints", 25);
        unit.setProperties(properties);
        System.out.println("...Set \"hitPoint\" to 25");

        System.out.println("...Getting unit type: " +
                unit.getType());
        System.out.println("...Getting unit hitPoint" +
                unit.getProperties());

        System.out.println("Test complete.");

    }

    @Test
    public void testChangeUnit(){
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit();
        System.out.println("...Created a new unit");

        Map properties = new HashMap();
        properties.put("hitPoints", 25);
        unit.setProperties(properties);
        System.out.println("...Set \"hitPoint\" to 25");

        properties.put("hitPoints", 15);
        unit.setProperties(properties);
        System.out.println("...Set \"hitPoint\" to 15");

        System.out.println("...Getting unit hitPoint" +
                unit.getProperties());

        System.out.println("Test complete.");
    }

    // Como retorna um atributo especifo do map????????
    @Ignore
    //@Test
    public void testsNotSetPropertie(){
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit();
        System.out.println("...Created a new unit");

        Map properties = new HashMap();
        properties.put("hitPoints", 25);
        unit.setProperties(properties);
        System.out.println("...Set \"hitPoint\" to 25");

        System.out.println("...Getting unit strength" +
                unit.getProperties());

        System.out.println("Test complete.");
    }


}
