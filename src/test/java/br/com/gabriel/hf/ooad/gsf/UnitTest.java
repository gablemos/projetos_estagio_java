package br.com.gabriel.hf.ooad.gsf;

import br.com.gabriel.hf.ooad.gsf.unit.Unit;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UnitTest extends TestCase{

    public void testUnit() throws IllegalAccessException {
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit(1);
        System.out.println("...Created a new unit");

        unit.setType("infantry");
        System.out.println("...Set \"type\" to \"infantry\" ");


        unit.setProperty("hitPoints", 25);
        System.out.println("...Set \"hitPoint\" to 25");

        System.out.println("...Getting unit type: " +
                unit.getType());

        System.out.println("...Getting unit hitPoint: " +
                unit.getProperty("hitPoints"));

        System.out.println("Test complete.");

    }

    /*
    @Description Testa criar unidade, atribuir uma property
    alterar o valor da property
    e recuperar o valor
     */
    public void testChangeUnit() throws IllegalAccessException {
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit(2);
        System.out.println("...Created a new unit");

        unit.setProperty("hitPoints", 25);
        System.out.println("...Set \"hitPoint\" to 25");

        unit.setProperty("hitPoints", 15);
        System.out.println("...Set \"hitPoint\" to 15");

        System.out.println("...Getting unit hitPoint: " +
            unit.getProperty("hitPoints"));

        System.out.println("Test complete.");
    }

    /*
    @Description Testa criar unidade, atribuir uma property
    e recuperar o valor de uma property não atribuida
    e recuperar o valor da property atribuida
     */
    public void testsNotSetPropertie() throws IllegalAccessException {
        System.out.println("Testing the Unit class...");

        Unit unit = new Unit(3);
        System.out.println("...Created a new unit");

        unit.setProperty("hitPoints", 25);
        System.out.println("...Set \"hitPoint\" to 25");

        System.out.println("...Getting unit strength: " +
                unit.getProperty("strength"));

        System.out.println("...Getting unit hitPoint: " +
                unit.getProperty("hitPoints"));

        System.out.println("Test complete.");
    }

    public void testHitPoint() throws IllegalAccessException {
        Unit unit = new Unit(4);
        unit.setProperty("hitPoint", 25);
        assertEquals(25, unit.getProperty("hitPoint"));
    }


}
