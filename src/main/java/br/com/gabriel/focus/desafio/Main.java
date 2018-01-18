package br.com.focus.Desafio;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        initializePhoneBook(listaTelefonica);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");
        List consulta;

        try {
            consulta = listaTelefonica.search(scanner.next());
            if (!consulta.isEmpty()){
                System.out.println("\nEncontrei estes contatos ...");

                for (Iterator i = consulta.iterator(); i.hasNext(); ){
                    Pessoa pessoa = (Pessoa)i.next();

                    System.out.println("Nome: " + pessoa.getNome() + " - Telefone: " + pessoa.getTelefone());
                }
            }else{
                System.out.println("Desculpe, não consegui encontar nenhum contato!");
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }


    }

    public static void initializePhoneBook(ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(new Pessoa("Rafaela", "111111"));
        listaTelefonica.addContato(new Pessoa("Gabriel", "222222"));
        listaTelefonica.addContato(new Pessoa("Lucas", "333333"));
        listaTelefonica.addContato(new Pessoa("Maisa", "444444"));
        listaTelefonica.addContato(new Pessoa("Guilherme", "555555"));
        listaTelefonica.addContato(new Pessoa("Romulo", "666666"));
        listaTelefonica.addContato(new Pessoa("Remo", "777777"));
        listaTelefonica.addContato(new Pessoa("Rafael", "888888"));

    }
}
