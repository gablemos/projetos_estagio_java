package br.com.focus.Test;

import br.com.focus.Desafio.ListaTelefonica;
import br.com.focus.Desafio.Pessoa;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class TesteDesafio {

    public static void initializePhoneBook(ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(new Pessoa("Rafaela", "1111112"));
        listaTelefonica.addContato(new Pessoa("Gabriel", "222222"));
        listaTelefonica.addContato(new Pessoa("Lucas", "333333"));
        listaTelefonica.addContato(new Pessoa("Maisa", "444444"));
        listaTelefonica.addContato(new Pessoa("Guilherme", "555555"));
        listaTelefonica.addContato(new Pessoa("Romulo", "666666"));
        listaTelefonica.addContato(new Pessoa("Remo", "777777"));
        listaTelefonica.addContato(new Pessoa("Rafael", "888888"));

    }

    /*
    @Description Testa a busca de contatos informando apenas 1 letra
    exibe os contatos encontrados
     */
    @Test
    public void buscaLetra(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = null;

        try {
            consulta = listaTelefonica.search("G");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato.");
        }
    }

    /*
   @Description Testa a busca de contatos informando nome parcial/completo
   exibe os contatos encontrados
    */
    @Test
    public void buscaNome(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = null;
        try {
            consulta = listaTelefonica.search("Rafael");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato");
        }
    }

    /*
   @Description Testa a busca de contatos com informações que não ha na lista
   deve retornar que não encontrou
    */
    @Test
    public void buscaInesistente(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = null;
        try {
            consulta = listaTelefonica.search("Z");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato!!");
        }
    }

    /*
    Testa passar o parametro de busca como nulo
     */
    @Test
    public void buscaNull(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");
        String x = null;

        List consulta = null;
        try {
            consulta = listaTelefonica.search(x);
            if (!consulta.isEmpty()){
                System.out.println("\nEncontrei estes contatos ....");

                for (Iterator i = consulta.iterator(); i.hasNext(); ){
                    Pessoa pessoa = (Pessoa)i.next();

                    System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
                }
            }else{
                System.out.println("Desculpe, não consegui encontar nenhum contato!");
            }
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }


    }
}
