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

    public static void inicializarListaTelefonica(ListaTelefonica listaTelefonica){
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
    public void testConsultarLetra() throws IllegalAccessException{
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        List consulta = listaTelefonica.consultarContatos("G");

        List resultado = new LinkedList();
        resultado.add(contato2);
        resultado.add(contato5);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testConsultarNome() throws IllegalAccessException{
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        List consulta = listaTelefonica.consultarContatos("Rafael");

        List resultado = new LinkedList();
        resultado.add(contato1);
        resultado.add(contato8);

        assertEquals(resultado, consulta);
    }

    @Test
    public void testConsultarForaDaAgenda() throws IllegalAccessException{
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        List consulta = listaTelefonica.consultarContatos("Z");

        assertThat(consulta.isEmpty(), is(true));
    }

    @Test
    public void testConsultarNulo() throws IllegalAccessException{
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        boolean excpetion = false;

        try{
            listaTelefonica.consultarContatos(null);
        }catch (NullPointerException e){
            excpetion = true;
        }

        assertTrue(excpetion);
    }

    @Test
    public void testImprimirConsulta() throws IllegalAccessException{
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        List consulta = listaTelefonica.consultarContatos("G");

        listaTelefonica.imprimirContatos(consulta);
    }

    @Test
    public void testImprimirListaNula(){
        ListaTelefonica listaTelefonica =  new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        boolean excpetion = false;

        try{
            List consulta = null;
            listaTelefonica.imprimirContatos(consulta);
        }catch (NullPointerException e){
            excpetion = true;
        }

        assertTrue(excpetion);
    }
}
