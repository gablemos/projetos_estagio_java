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

    @Test
    public void buscaLetra(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = listaTelefonica.search("G");

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        }
    }

    @Test
    public void buscaNome(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = listaTelefonica.search("Rafael");

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        }
    }

    @Test
    public void buscaInesistente(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        List consulta = listaTelefonica.search("Z");

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        }
    }

    @Ignore
    public void buscaNull(){
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");
        String x = null;

        List consulta = listaTelefonica.search(x);

        if (!consulta.isEmpty()){
            System.out.println("\nEncontrei estes contatos ...");

            for (Iterator i = consulta.iterator(); i.hasNext(); ){
                Pessoa pessoa = (Pessoa)i.next();

                System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
            }
        }else{
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        }
    }
}
