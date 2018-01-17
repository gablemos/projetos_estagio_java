package br.com.hf.ooad.gsf.test;

import br.com.hf.ooad.gsf.unit.Unit;
;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    /*
    @Description Testa criar unidade, atribuir type e uma property
    e recuperar os valores
     */
    @Test
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
    @Test
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
    @Test
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

    @Test
    public void hitPoint() throws IllegalAccessException {
        Unit unit = new Unit(4);
        unit.setProperty("hitPoint", 25);
        Assert.assertEquals(25, unit.getProperty("hitPoint"));
    }


}
