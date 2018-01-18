package br.com.gabriel.focus.desafio;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class TesteDesafio{
    static Pessoa pessoa1 = new Pessoa("Rafaela", "1111112");
    static Pessoa pessoa2 = new Pessoa("Gabriel", "222222");
    static Pessoa pessoa3 = new Pessoa("Lucas", "333333");
    static Pessoa pessoa4 = new Pessoa("Maisa", "444444");
    static Pessoa pessoa5 = new Pessoa("Guilherme", "555555");
    static Pessoa pessoa6 = new Pessoa("Romulo", "666666");
    static Pessoa pessoa7 = new Pessoa("Remo", "777777");
    static Pessoa pessoa8 = new Pessoa("Rafael", "888888");

    public static void initializePhoneBook(ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(pessoa1);
        listaTelefonica.addContato(pessoa2);
        listaTelefonica.addContato(pessoa3);
        listaTelefonica.addContato(pessoa4);
        listaTelefonica.addContato(pessoa5);
        listaTelefonica.addContato(pessoa6);
        listaTelefonica.addContato(pessoa7);
        listaTelefonica.addContato(pessoa8);
    }

    @Test
    public void testBuscarLetra(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.search("G");

        List resultado = new LinkedList();
        resultado.add(pessoa2);
        resultado.add(pessoa5);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testBuscaNome(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.search("Rafael");

        List resultado = new LinkedList();
        resultado.add(pessoa1);
        resultado.add(pessoa8);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testForaDaAgenda(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        List consulta = listaTelefonica.search("Z");

        assertThat(consulta.isEmpty(), is(true));
    }

    @Test
    public void testNulo(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        boolean excpetion = false;

        try{
            listaTelefonica.search(null);
        }catch (NullPointerException e){
            excpetion = true;
        }

        assertTrue(excpetion);
    }
}
