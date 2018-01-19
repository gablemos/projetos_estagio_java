package br.com.gabriel.focus.primeirodesafio;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class TesteDesafio{
    static Contato contato1 = new Contato("Rafaela", "1111112");
    static Contato contato2 = new Contato("Gabriel", "222222");
    static Contato contato3 = new Contato("Lucas", "333333");
    static Contato contato4 = new Contato("Maisa", "444444");
    static Contato contato5 = new Contato("Guilherme", "555555");
    static Contato contato6 = new Contato("Romulo", "666666");
    static Contato contato7 = new Contato("Remo", "777777");
    static Contato contato8 = new Contato("Rafael", "888888");

    public static void initializePhoneBook(ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(contato1);
        listaTelefonica.addContato(contato2);
        listaTelefonica.addContato(contato3);
        listaTelefonica.addContato(contato4);
        listaTelefonica.addContato(contato5);
        listaTelefonica.addContato(contato6);
        listaTelefonica.addContato(contato7);
        listaTelefonica.addContato(contato8);
    }

    @Test
    public void testBuscarLetra(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.consultaContato("G");

        List resultado = new LinkedList();
        resultado.add(contato2);
        resultado.add(contato5);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testBuscaNome(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.consultaContato("Rafael");

        List resultado = new LinkedList();
        resultado.add(contato1);
        resultado.add(contato8);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testForaDaAgenda(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.consultaContato("Z");

        assertThat(consulta.isEmpty(), is(true));
    }

    @Test
    public void testNulo(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        boolean excpetion = false;

        try{
            listaTelefonica.consultaContato(null);
        }catch (NullPointerException e){
            excpetion = true;
        }

        assertTrue(excpetion);
    }
}
